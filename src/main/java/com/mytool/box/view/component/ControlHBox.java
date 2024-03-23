package com.mytool.box.view.component;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ControlHBox extends HBox {

  private final HBox leftBox;
  private final HBox rightBox;

  public ControlHBox() {
    this(5);
  }

  public ControlHBox(double spacing) {
    super();
    this.setAlignment(Pos.CENTER);
    this.setPadding(new Insets(5, 0, 5, 0));
    Region spacer = new Region();
    HBox.setHgrow(spacer, Priority.ALWAYS);
    leftBox = new HBox();
    rightBox = new HBox();
    leftBox.setSpacing(spacing);
    rightBox.setSpacing(spacing);
    this.getChildren().addAll(leftBox, spacer, rightBox);
  }

  public ControlHBox addLeft(Node node) {
    leftBox.getChildren().add(node);
    return this;
  }

  public ControlHBox addLeftAll(Node... node) {
    leftBox.getChildren().addAll(node);
    return this;
  }

  public ControlHBox addRight(Node node) {
    rightBox.getChildren().add(node);
    return this;
  }

  public ControlHBox addRightAll(Node... node) {
    rightBox.getChildren().addAll(node);
    return this;
  }

}
