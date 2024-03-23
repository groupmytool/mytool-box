package com.mytool.box.service.tool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuService {

  public Map<String, Map<String, Map<String, String>>> getMenuMap() {
    // first-level menu
    HashMap<String, Map<String, Map<String, String>>> menuMap = new HashMap<>();
    menuMap.put("收藏夹", new HashMap<>());
    menuMap.put("网络安全", new HashMap<>());
    menuMap.put("格式化工具", new HashMap<>());
    menuMap.put("文本工具", new HashMap<>());
    // second-level menu
    HashMap<String, Map<String, String>> fileMenu = new HashMap<>();
    // third-level menu
    HashMap<String, String> fileMenuMap = new HashMap<>();

    return menuMap;
  }

}
