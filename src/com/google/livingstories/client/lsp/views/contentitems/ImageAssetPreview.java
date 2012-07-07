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

package com.google.livingstories.client.lsp.views.contentitems;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.livingstories.client.AssetContentItem;
import com.google.livingstories.client.lsp.views.Resources;
import com.google.livingstories.client.ui.Slideshow;
import com.google.livingstories.client.util.BoundedImage;
import com.google.livingstories.client.util.Constants;
import com.google.livingstories.client.util.DecoratedBoundedImagePanel;
import com.google.livingstories.client.util.GlobalUtil;
import com.google.livingstories.client.util.LivingStoryControls;
import com.google.livingstories.client.util.DecoratedBoundedImagePanel.IconPlacement;

import java.util.List;

/**
 * Renders a preview image for an image asset.  Depending on whether or not this
 * asset has a full view, this will either render a thumbnail-only view or a clickable
 * view that pops up a lightbox.
 */
public class ImageAssetPreview extends Composite {
  private static ImageAssetPreviewUiBinder uiBinder = GWT.create(ImageAssetPreviewUiBinder.class);
  interface ImageAssetPreviewUiBinder extends UiBinder<Widget, ImageAssetPreview> {
  }

  @UiField FocusPanel panel;
  @UiField Label header;
  @UiField SimplePanel preview;
  @UiField HTML caption;
  
  protected AssetContentItem contentItem;
  private Widget imagePreview;
  
  public ImageAssetPreview(AssetContentItem contentItem) {
    this.contentItem = contentItem;
    
    bind();
    
    String previewUrl = contentItem.getPreviewUrl();
    String captionText = contentItem.getCaption();
    if (!GlobalUtil.isContentEmpty(previewUrl)) {
      imagePreview = createPreviewImage(contentItem);
      preview.add(imagePreview);
    }
    if (!GlobalUtil.isContentEmpty(captionText)) {
      caption.setHTML(captionText);
    }
    if (hasContent()) {
      if (imagePreview != null) {
        imagePreview.addStyleName(Resources.INSTANCE.css().clickable());
      }
      caption.addStyleName(Resources.INSTANCE.css().clickable());
    }
    if (contentItem.getRenderAsSeen()) {
      panel.addStyleName(Resources.INSTANCE.css().read());
    }
  }
  
  protected void bind() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public ImageAssetPreview hideHeader() {
    header.setVisible(false);
    return this;
  }
  
  protected Widget createPreviewImage(AssetContentItem contentItem) {
    if (hasContent()) {
      // TODO: Change the DecoratedBoundedImagePanel class to allow decoration
      // of an existing bounded image, rather than extending AbsolutePanel and doing it separately.
      // Should result in cleaner and nicer code.
      return new DecoratedBoundedImagePanel(
          contentItem.getPreviewUrl(), Constants.MAX_IMAGE_PREVIEW_WIDTH, Integer.MAX_VALUE,
          Constants.ZOOM_ICON, Constants.ZOOM_WIDTH, Constants.ZOOM_HEIGHT,
          IconPlacement.LOWER_RIGHT);      
    } else {
      return new BoundedImage(contentItem.getPreviewUrl(), Constants.MAX_IMAGE_PREVIEW_WIDTH);
    }
  }
  
  @UiHandler("panel")
  public void handleClick(ClickEvent e) {
    if (hasContent()) {
      List<AssetContentItem> allImages = contentItem.getRelatedAssets();
      if (allImages != null && allImages.size() > 1) {
        new Slideshow(allImages).show(allImages.indexOf(contentItem));
      } else {
        LivingStoryControls.showLightbox(contentItem.getTitleString(), contentItem);
      }
    }
  }
  
  private boolean hasContent() {
    return !GlobalUtil.isContentEmpty(contentItem.getContent());
  }
}
