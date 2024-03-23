package com.mytool.box.view.component;

import com.mytool.box.utils.file.FontUtil;
import javafx.scene.text.Text;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class FontText extends Text {

  public FontText() {
    super();
    this.setFont(FontUtil.getFont());
  }

  public FontText(String text) {
    super(text);
    this.setFont(FontUtil.getFont());
  }

}
