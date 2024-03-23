package com.mytool.box.utils.thread;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
@FunctionalInterface
public interface FuncInterface<V> {
  void handle(V event);
}

