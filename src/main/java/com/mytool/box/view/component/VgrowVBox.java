package com.mytool.box.view.component;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class VgrowVBox extends VBox {

  public VgrowVBox(Pos pos) {
    super();
    VBox.setVgrow(this, Priority.ALWAYS);
    this.setAlignment(pos);
  }

  public VgrowVBox(Pos pos, Node... children) {
    super();
    VBox.setVgrow(this, Priority.ALWAYS);
    this.setAlignment(pos);
    this.getChildren().addAll(children);
  }

  public VgrowVBox(Pos pos, boolean visible) {
    super();
    VBox.setVgrow(this, Priority.ALWAYS);
    this.setAlignment(pos);
    this.setVisible(visible);
    this.setManaged(visible);
  }

}
