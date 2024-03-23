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
public class SettingsButton extends Button {


  public SettingsButton(Image iconImage, StringProperty settingsProperty, EventHandler<MouseEvent> eventHandler) {
    super();
    this.setPrefWidth(Double.MAX_VALUE);
    this.setPrefHeight(30);
    this.setOnMouseClicked(eventHandler);
    this.textProperty().bind(settingsProperty);
    this.setGraphic(new SizeImageView(iconImage, 20));
    this.setContentDisplay(ContentDisplay.LEFT);
  }


}
