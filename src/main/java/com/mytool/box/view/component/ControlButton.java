package com.mytool.box.view.component;

import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ControlButton extends Button {

  public ControlButton() {
    super();
  }

  public ControlButton(String text) {
    super(text);
  }

  public ControlButton(final ObservableValue<String> value) {
    super();
    this.textProperty().bind(value);
  }

  public ControlButton(Image icon, StringProperty textProperty) {
    super();
    this.textProperty().bind(textProperty);
    this.setGraphic(new SizeImageView(icon, 15));
    this.setContentDisplay(ContentDisplay.LEFT);
  }

}
