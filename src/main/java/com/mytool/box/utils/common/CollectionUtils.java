package com.mytool.box.utils.common;

import java.util.Collection;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class CollectionUtils {

  public static boolean isEmpty(Collection<?> collection) {
    return collection == null || collection.isEmpty();
  }

  public static boolean isNotEmpty(Collection<?> collection) {
    return !isEmpty(collection);
  }

}
