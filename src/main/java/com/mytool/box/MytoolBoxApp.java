package com.mytool.box;

import com.mytool.box.controller.MainController;
import com.mytool.box.utils.base.LocaleUtil;
import com.mytool.box.utils.log.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import static com.mytool.box.utils.base.Constants.LAYOUT_MIN_HEIGHT;
import static com.mytool.box.utils.base.Constants.LAYOUT_MIN_WIDTH;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MytoolBoxApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    LocaleUtil.init();
    stage.titleProperty().bind(LocaleUtil.get("module.app"));
    MainController controller = new MainController();
    stage.setScene(controller.getScene());
    stage.setMinWidth(LAYOUT_MIN_WIDTH);
    stage.setMinHeight(LAYOUT_MIN_HEIGHT);
    stage.show();
    Logger.debug("Application started");
  }

}