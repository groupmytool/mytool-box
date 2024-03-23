package com.mytool.box.utils.common;

import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class DateUtils {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

  public static String formatTime(FileTime fileTime) {
    return FORMATTER.format(fileTime.toInstant());
  }

}
