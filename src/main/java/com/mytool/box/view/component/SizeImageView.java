package com.mytool.box.view.component;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class SizeImageView extends ImageView {

  public SizeImageView(Image image, double size) {
    super(image);
    this.setFitHeight(size);
    this.setFitWidth(size);
  }

  public SizeImageView(Image image, double height, double width) {
    super(image);
    this.setFitHeight(height);
    this.setFitWidth(width);
  }

}
