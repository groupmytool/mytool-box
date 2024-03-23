package com.mytool.box.utils.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ThreadPoolExecutorUtil {

  public static ThreadPoolExecutor EXECUTOR_UI = new ThreadPoolExecutor(3,
      5,
      10,
      TimeUnit.SECONDS,
      new ArrayBlockingQueue<Runnable>(10),
      Executors.defaultThreadFactory(),
      new ThreadPoolExecutor.AbortPolicy()
  );

}
