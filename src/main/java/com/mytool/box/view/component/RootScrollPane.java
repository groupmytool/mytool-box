package com.mytool.box.view.component;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class RootScrollPane extends ScrollPane {
  public RootScrollPane() {
    super();
    this.setFitToWidth(true);
    this.setFitToHeight(true);
    this.setPadding(new Insets(5, 5, 5, 5));
  }
}
