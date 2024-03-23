package com.mytool.box.view.main;

import javafx.scene.Parent;
import javafx.scene.Scene;

import java.net.URL;

import static com.mytool.box.utils.base.Constants.LAYOUT_DEFAULT_HEIGHT;
import static com.mytool.box.utils.base.Constants.LAYOUT_DEFAULT_WIDTH;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MainScene extends Scene {

  public MainScene(Parent root) {
    super(root, LAYOUT_DEFAULT_WIDTH, LAYOUT_DEFAULT_HEIGHT);
    URL resource = getClass().getResource("/css/scroll-pane.css");
    if (resource != null) {
      this.getStylesheets().add(resource.toExternalForm());
    }
  }

}
