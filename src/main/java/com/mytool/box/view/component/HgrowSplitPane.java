package com.mytool.box.view.component;

import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import java.net.URL;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class HgrowSplitPane extends SplitPane {
  public HgrowSplitPane() {
    super();
    URL resource = getClass().getResource("/css/split-pane.css");
    if (resource != null) {
      this.getStylesheets().add(resource.toExternalForm());
    }
    HBox.setHgrow(this, Priority.ALWAYS);
  }
}
