package com.mytool.box.view.menu;

import com.mytool.box.view.component.SizeImageView;
import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuButton extends Button {

  public MenuButton(EventHandler<MouseEvent> eventHandler) {
    super();
    this.setPrefWidth(Double.MAX_VALUE);
    this.setPrefHeight(80);
    this.setOnMouseClicked(eventHandler);
  }

  public MenuButton(Image iconImage, StringProperty menuNameProperty, EventHandler<MouseEvent> eventHandler) {
    this(eventHandler);
    this.textProperty().bind(menuNameProperty);
    this.setGraphic(new SizeImageView(iconImage, 35));
    this.setContentDisplay(ContentDisplay.TOP);
  }

}
