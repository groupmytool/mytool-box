package com.mytool.box.view.menu;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * 菜单模块视图工具类
 *
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuVBox extends VBox {

  private final VBox topBox;
  private final VBox bottomBox;

  public MenuVBox() {
    this(5);
  }

  public MenuVBox(double spacing) {
    super();
    this.setAlignment(Pos.CENTER);
    Region spacer = new Region();
    VBox.setVgrow(spacer, Priority.ALWAYS);
    topBox = new VBox();
    bottomBox = new VBox();
    topBox.setSpacing(spacing);
    bottomBox.setSpacing(spacing);
    this.getChildren().addAll(topBox, spacer, bottomBox);
  }

  public MenuVBox addTop(Node node) {
    topBox.getChildren().add(node);
    return this;
  }

  public MenuVBox addTopAll(Node... node) {
    topBox.getChildren().addAll(node);
    return this;
  }

  public MenuVBox addBottom(Node node) {
    bottomBox.getChildren().add(node);
    return this;
  }

  public MenuVBox addBottomAll(Node... node) {
    bottomBox.getChildren().addAll(node);
    return this;
  }

}
