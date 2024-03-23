package com.mytool.box.controller;

import com.mytool.box.controller.module.ModuleController;
import com.mytool.box.view.component.HgrowSplitPane;
import com.mytool.box.view.main.MainScene;
import com.mytool.box.view.main.MainWindow;
import javafx.scene.Scene;

/**
 * 首页布局控制器
 *
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MainController {

  public Scene getScene() {
    HgrowSplitPane hgrowSplitPane = new HgrowSplitPane();
    // 主窗口
    MainWindow root = new MainWindow();
    // 菜单栏
    ModuleController menu = new ModuleController(hgrowSplitPane);
    root.getChildren().add(menu.getView());
    // 右侧内容栏
    root.getChildren().add(hgrowSplitPane);
    return new MainScene(root);
  }

}
