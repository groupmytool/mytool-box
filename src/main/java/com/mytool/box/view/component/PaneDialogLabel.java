package com.mytool.box.view.component;

import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class PaneDialogLabel extends Label {

  public PaneDialogLabel(SimpleStringProperty textProperty){
    super();
    this.setPrefWidth(200);
    this.setAlignment(Pos.CENTER_RIGHT);
    this.textProperty().bind(textProperty);
  }

}
