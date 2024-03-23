package com.mytool.box.utils.base;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class Constants {

  public static final String IDENTIFIER = "com.mytool.box";
  public static final String VENDOR = "MyToolBox";
  public static final String APP_ROOT_PATH = "/Applications";

  public static final int LAYOUT_MIN_WIDTH = 640;
  public static final int LAYOUT_MIN_HEIGHT = 480;

  public static final int LAYOUT_DEFAULT_WIDTH = 1080;
  public static final int LAYOUT_DEFAULT_HEIGHT = 760;

  /**
   * 默认目录
   */
  public static final String SUPPORT_PATH = "%s/Library/Application Support/".formatted(System.getProperty("user.home"));
  public static final String CACHE_PATH = "%s/Library/Caches/".formatted(System.getProperty("user.home"));
  public static final String LOG_PATH = "%s/Library/Logs/".formatted(System.getProperty("user.home"));


}
