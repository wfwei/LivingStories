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

package com.google.livingstories.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.livingstories.client.ClientMessageHolder;
import com.google.livingstories.client.ContentRpcService;
import com.google.livingstories.client.ContentRpcServiceAsync;

import java.util.Date;

/**
 * Class that displays the number of updates in the living story since the specified date.
 */
public class UpdateCountWidget extends Composite {
  private ContentRpcServiceAsync contentService = GWT.create(ContentRpcService.class);
  
  private Label label;
  
  public UpdateCountWidget() {
    label = new Label();
    label.setStylePrimaryName("updateText");
    initWidget(label);
  }

  public void load(long livingStoryId, final Date lastVisitTime) {
    if (lastVisitTime != null) {
      contentService.getUpdateCountSinceTime(livingStoryId, lastVisitTime,
          new AsyncCallback<Integer>() {
            @Override
            public void onFailure(Throwable caught) {}
            @Override
            public void onSuccess(Integer result) {
              // We use a special "No updates" string if the locale is English here, but this
              // mechanism won't work in the general case, where we should simply fall back on a
              // string that may just directly include the numeral 0.
              label.setText(
                  (result == 0 && LocaleInfo.getCurrentLocale().getLocaleName().startsWith("en"))
                  ? "No updates since last visit"
                  : ClientMessageHolder.msgs.updatesSinceLastVisit(result));
            }
          });
    }
  }
}
