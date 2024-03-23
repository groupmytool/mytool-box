package com.mytool.box.utils.file;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.InputStream;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class FontUtil {

  /**
   * 加载位于resources资源库的本地字体
   *
   * @param localPath 字体资源路径，如：/font/SourceHanSansCN-Bold.otf
   * @param size      字体大小
   * @return 字体对象
   */
  public static Font loadLocalFont(String localPath, double size) {
    InputStream inputStream = FontUtil.class.getResourceAsStream(localPath);
    if (inputStream != null) {
      return Font.loadFont(inputStream, size);
    } else {
      return new Font(size);
    }
  }

  /**
   * 获取系统默认粗体
   *
   * @param size 字体大小
   * @return 字体对象
   */
  public static Font getBoldFont(double size) {
    return Font.font(getFontFamily(), FontWeight.BOLD, size);
  }

  /**
   * 获取系统默认字体
   *
   * @param size 字体大小
   * @return 字体对象
   */
  public static Font getFont(double size) {
    return Font.font(getFontFamily(), FontWeight.BOLD, size);
  }

  public static Font getFont() {
    return Font.font(getFontFamily());
  }

  /**
   * 获取字体Family
   *
   * @return 字体Family
   */
  public static String getFontFamily() {
    return "Arial";
  }

}
