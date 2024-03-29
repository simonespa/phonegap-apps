/*
 * Copyright (c) 2010 Zhihua (Dennis) Jiang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtmobile.ui.kitchensink.client.transition;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.event.SelectionChangedEvent;
import com.gwtmobile.ui.client.page.Page;
import com.gwtmobile.ui.client.widgets.HeaderPanel;
import com.gwtmobile.ui.client.widgets.ListPanel;

public class TransitionDemoPage extends Page {

    @UiField
    HeaderPanel header;
    @UiField
    ListPanel list;

    private static TransitionPageUiBinder uiBinder = GWT.create(TransitionPageUiBinder.class);

    interface TransitionPageUiBinder extends UiBinder<Widget, TransitionDemoPage> {
    }

    public TransitionDemoPage() {
	initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("list")
    void onListSelectionChanged(SelectionChangedEvent e) {
    }

}
