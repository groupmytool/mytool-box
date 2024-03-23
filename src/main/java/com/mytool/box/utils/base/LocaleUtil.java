package com.mytool.box.utils.base;

import javafx.beans.property.SimpleStringProperty;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class LocaleUtil {

  private static Locale locale;

  private static final Map<String, SimpleStringProperty> BUNDLE_MAP = new HashMap<>();

  public static void init() {
    Locale locale = LocaleUtil.getLocale();
    ResourceBundle moduleBundle = ResourceBundle.getBundle("global.module", locale);
    moduleBundle.keySet().forEach(key -> BUNDLE_MAP.put("module." + key, new SimpleStringProperty(moduleBundle.getString(key))));
    ResourceBundle toolBundle = ResourceBundle.getBundle("global.tool", locale);
    toolBundle.keySet().forEach(key -> BUNDLE_MAP.put("tool." + key, new SimpleStringProperty(toolBundle.getString(key))));
  }

  public static void reload() {
    Locale locale = LocaleUtil.getLocale();
    ResourceBundle moduleBundle = ResourceBundle.getBundle("global.module", locale);
    moduleBundle.keySet().forEach(key -> BUNDLE_MAP.get("module." + key).set(moduleBundle.getString(key)));
    ResourceBundle toolBundle = ResourceBundle.getBundle("global.tool", locale);
    toolBundle.keySet().forEach(key -> BUNDLE_MAP.get("tool." + key).set(toolBundle.getString(key)));
  }

  public static SimpleStringProperty get(String key) {
    return BUNDLE_MAP.get(key);
  }

  public static void setLocale(String language) {
    if (Locale.CHINA.getLanguage().equalsIgnoreCase(language)) {
      LocaleUtil.locale = Locale.CHINA;
    } else {
      LocaleUtil.locale = Locale.US;
    }
  }

  /**
   * Use Chinese only when it's China, use English in all other cases
   *
   * @return Locale China or US
   */
  public static Locale getLocale() {
    if (locale != null) {
      return locale;
    }
    if (Locale.CHINA.getLanguage().equals(Locale.getDefault().getLanguage())) {
      return Locale.CHINA;
    } else {
      return Locale.US;
    }
  }


}
