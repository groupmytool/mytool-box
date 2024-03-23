package com.mytool.box.view.component;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class PaneDialog<R> extends Dialog<R> {

  public PaneDialog(SimpleStringProperty titleProperty, Node contentNode) {
    super();
    this.titleProperty().bind(titleProperty);
    this.getDialogPane().setContent(contentNode);
    this.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
    this.getDialogPane().getButtonTypes().add(ButtonType.OK);
  }

  public void setOkAction(EventHandler<ActionEvent> eventHandler) {
    Button okButton = (Button) this.getDialogPane().lookupButton(ButtonType.OK);
    okButton.setOnAction(eventHandler);
  }

  public void setCancelAction(EventHandler<ActionEvent> eventHandler) {
    Button okButton = (Button) this.getDialogPane().lookupButton(ButtonType.CANCEL);
    okButton.setOnAction(eventHandler);
  }

}
