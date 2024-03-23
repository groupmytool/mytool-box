package com.mytool.box.view.menu;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;

import static com.mytool.box.utils.base.Constants.LAYOUT_MIN_WIDTH;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuScrollPane extends ScrollPane {

  public static final Double MENU_WIDTH = LAYOUT_MIN_WIDTH * 0.2;

  public MenuScrollPane() {
    super();
    this.setFitToWidth(true);
    this.setMinWidth(MENU_WIDTH);
    this.setMaxWidth(MENU_WIDTH);
    this.setPrefWidth(MENU_WIDTH);
    this.setPadding(new Insets(5, 5, 5, 5));
  }

}
