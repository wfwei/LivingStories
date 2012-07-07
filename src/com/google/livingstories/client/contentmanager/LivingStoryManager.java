/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.livingstories.client.contentmanager;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.livingstories.client.LivingStory;
import com.google.livingstories.client.LivingStoryRpcService;
import com.google.livingstories.client.LivingStoryRpcServiceAsync;
import com.google.livingstories.client.PublishState;
import com.google.livingstories.client.lsp.ContentRenderer;
import com.google.livingstories.client.ui.CoordinatedLivingStorySelector;
import com.google.livingstories.client.ui.RichTextEditor;
import com.google.livingstories.client.util.LivingStoryData;

/**
 * UI for managing living stories
 */
public class LivingStoryManager extends ManagerPane {
  interface MyUiBinder extends UiBinder<Widget, LivingStoryManager> {}
  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
  
  private final LivingStoryRpcServiceAsync livingStoryService
      = GWT.create(LivingStoryRpcService.class);

  @UiField CoordinatedLivingStorySelector livingStorySelector;
  @UiField Button createButton;
  
  @UiField DeckPanel contentPanel;
  @UiField Label livingStoryIdLabel;
  @UiField TextBox urlTextBox;
  @UiField TextBox titleTextBox;
  @UiField RichTextEditor summaryEditor;
  @UiField Label publishStateLabel;
  @UiField Button updatePreviewButton;
  @UiField Button saveDraftButton;
  @UiField Button publishButton;
  @UiField Button deleteButton;
  @UiField Label statusMessage;
  @UiField SimplePanel previewPanel;

  /* Widgets for the create living story dialog */
  private DialogBox createDialog;
  private TextBox createDialogTextBox;
  private Button createDialogSaveButton;
  
  
  public LivingStoryManager() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  @UiHandler("createButton")
  void createLivingStory(ClickEvent e) {
    getCreateDialog().center();
  }

  private DialogBox getCreateDialog() {
    if (createDialog == null) {
      // creates the dialog box on first demand, but reuses it for subsequent
      // appearances
      createDialog = new DialogBox();
      createDialog.setText("Enter story url");
      createDialog.setAnimationEnabled(true);
      
      VerticalPanel dialogVPanel = new VerticalPanel();
      dialogVPanel.add(new HTML("Enter the desired story url name"));
      createDialogTextBox = new TextBox();
      // dialog text is set below
      dialogVPanel.add(createDialogTextBox);
      
      HorizontalPanel buttonPanel = new HorizontalPanel();
      createDialogSaveButton = new Button("Save");
      createDialogSaveButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
          closeCreateDialog(false);
        }
      });
      buttonPanel.add(createDialogSaveButton);
      Button cancelButton = new Button("Cancel");
      cancelButton.addClickHandler(new ClickHandler() {
        public void onClick(ClickEvent event) {
          closeCreateDialog(true);
        }
      });
      buttonPanel.add(cancelButton);
      dialogVPanel.add(buttonPanel);
      createDialog.setWidget(dialogVPanel);
    }

    createDialogTextBox.setText("");
    
    return createDialog;
  }
  
  private void closeCreateDialog(boolean isCancel) {
    if (isCancel) {
      createDialog.hide();
    } else {
      AsyncCallback<LivingStory> callback = new AsyncCallback<LivingStory>() {
        public void onSuccess(LivingStory story) {
          createDialogTextBox.setText("");
          createDialog.hide();
          String idString = String.valueOf(story.getId());
          if (!livingStorySelector.hasItemWithValue(idString)) {
            livingStorySelector.addItem(story.getTitle(), idString);
          }
          livingStorySelector.selectItemWithValue(idString);
          livingStorySelector.setCoordinatedLivingStoryIdFromSelection();
          populateStoryContent(story);
        }
        
        public void onFailure(Throwable caught) {
          createDialogSaveButton.setText("Story creation failed");
          createDialogSaveButton.setStyleName("failedbutton");
          createDialogSaveButton.setEnabled(false);
        }
      };
      
      livingStoryService.createLivingStory(createDialogTextBox.getText(), "New Story", callback);
    }
  }
  
  @UiHandler("deleteButton")
  void deleteLivingStory(ClickEvent event) {
    boolean delete = Window.confirm("Are you sure you want to delete this living story? " +
        "Doing so will also delete all content that belongs to it.");
    if (delete) {
      final String selectedStoryId = livingStorySelector.getSelectedItemValue();
      AsyncCallback<Void> callback = new AsyncCallback<Void>() {
        public void onSuccess(Void nothing) {
          livingStorySelector.removeItemWithValue(selectedStoryId);
          clearStoryContent();
          contentPanel.showWidget(0);
          livingStorySelector.clearCoordinatedLivingStoryId();
        }
        
        public void onFailure(Throwable caught) {
          statusMessage.setText("Deletion failed");
        }
      };
      
      livingStoryService.deleteLivingStory(Long.valueOf(selectedStoryId), callback);
    }
  }

  
  @UiHandler("updatePreviewButton")
  void updatePreview(ClickEvent event) {
    previewPanel.setWidget(new ContentRenderer(summaryEditor.getContent(), true));
  }

  @UiHandler("saveDraftButton")
  void saveDraft(ClickEvent event) {
    save(PublishState.DRAFT);
  }
  
  @UiHandler("publishButton")
  void publish(ClickEvent event) {
    save(PublishState.PUBLISHED);
  }
  
  private void save(PublishState publishState) {
    AsyncCallback<LivingStory> callback = new AsyncCallback<LivingStory>() {
      public void onSuccess(LivingStory story) {
        statusMessage.setText(
            story.getPublishState() == PublishState.PUBLISHED ? "Published!" : "Saved as draft");
        statusMessage.setStylePrimaryName("serverResponseLabelSuccess");
        publishStateLabel.setText(story.getPublishState().toString());
        // If the story title has been changed, refresh it in the list box
        livingStorySelector.setItemText(livingStorySelector.getSelectedIndex(), story.getTitle());
      }
      
      public void onFailure(Throwable caught) {
        statusMessage.setText("Saving failed.");
        statusMessage.setStylePrimaryName("serverResponseLabelError");
      }
    };

    updatePreview(null);
    livingStoryService.saveLivingStory(Long.valueOf(livingStorySelector.getSelectedItemValue()),
        urlTextBox.getText(), titleTextBox.getText(), publishState, summaryEditor.getContent(), 
        callback);
  }

  @UiFactory CoordinatedLivingStorySelector createLivingStoryList() {
    return new CoordinatedLivingStorySelector(livingStoryService);
  }

  @UiHandler("livingStorySelector")
  void changeLivingStories(ChangeEvent event) {
    if (livingStorySelector.hasSelection()) {
      Long livingStoryId = livingStorySelector.getSelectedLivingStoryId();
      LivingStoryData.setLivingStoryId(livingStoryId);

      AsyncCallback<LivingStory> callback = new AsyncCallback<LivingStory>() {
        public void onFailure(Throwable caught) {
          contentPanel.showWidget(0);
        }

        public void onSuccess(LivingStory story) {
          populateStoryContent(story);
        }
      };

      if (livingStoryId != null) {
        livingStoryService.getLivingStoryById(livingStoryId, false, callback);
      }
    }
  }

  
  private void populateStoryContent(LivingStory story) {
    contentPanel.showWidget(1);
    livingStoryIdLabel.setText(Long.toString(story.getId()));
    urlTextBox.setText(story.getUrl());
    titleTextBox.setText(story.getTitle());
    summaryEditor.setContent(story.getSummary());
    publishStateLabel.setText(story.getPublishState().toString());
    statusMessage.setText("");
    updatePreview(null);
  }
  
  private void clearStoryContent() {
    livingStoryIdLabel.setText("");
    urlTextBox.setText("");
    titleTextBox.setText("");
    summaryEditor.setContent("");
    publishStateLabel.setText("");
    statusMessage.setText("");
    previewPanel.clear();
  }
  
  @Override
  public void onShow() {
    livingStorySelector.selectCoordinatedLivingStory();
    changeLivingStories(null);

    if (livingStorySelector.hasSelection()) {
      LivingStoryData.setLivingStoryId(livingStorySelector.getSelectedLivingStoryId());
    }
  }
}
