package com.mytool.box.controller.module;

import com.mytool.box.controller.todo.TodoController;
import com.mytool.box.controller.tool.ContentController;
import com.mytool.box.controller.tool.MenuController;
import com.mytool.box.utils.base.LocaleUtil;
import com.mytool.box.view.component.HgrowSplitPane;
import com.mytool.box.view.menu.MenuButton;
import com.mytool.box.view.menu.MenuScrollPane;
import com.mytool.box.view.menu.MenuVBox;
import com.mytool.box.view.menu.SettingsButton;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

import static com.mytool.box.service.icon.MenuIconInstance.MODULE_AI_LAB;
import static com.mytool.box.service.icon.MenuIconInstance.MODULE_MANUALS;
import static com.mytool.box.service.icon.MenuIconInstance.MODULE_NOTES;
import static com.mytool.box.service.icon.MenuIconInstance.MODULE_RESOURCES;
import static com.mytool.box.service.icon.MenuIconInstance.MODULE_SETTINGS;
import static com.mytool.box.service.icon.MenuIconInstance.MODULE_TOOLS;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ModuleController {

  private final HgrowSplitPane contentPane;

  /**
   * cache of the tool view
   */
  public List<Node> toolView = new ArrayList<>();
  /**
   * cache of the todo view
   */
  public List<Node> todoView = new ArrayList<>();

  public ModuleController(HgrowSplitPane hgrowSplitPane) {
    this.contentPane = hgrowSplitPane;
  }

  public MenuScrollPane getView() {
    MenuScrollPane menu = new MenuScrollPane();
    MenuVBox menuVbox = new MenuVBox();

    menu.setContent(menuVbox);

    MenuButton toolBtn = new MenuButton(MODULE_TOOLS, LocaleUtil.get("module.tool"), toolEventHandler());
    MenuButton bookBtn = new MenuButton(MODULE_MANUALS, LocaleUtil.get("module.manual"), todoEventHandler());
    MenuButton resourceBtn = new MenuButton(MODULE_RESOURCES, LocaleUtil.get("module.resource"), todoEventHandler());
    MenuButton noteBtn = new MenuButton(MODULE_NOTES, LocaleUtil.get("module.note"), todoEventHandler());
    MenuButton aiLibBtn = new MenuButton(MODULE_AI_LAB, LocaleUtil.get("module.ai_lab"), todoEventHandler());
    menuVbox.addTopAll(toolBtn, bookBtn, resourceBtn, noteBtn, aiLibBtn);
    // todo: https://sunpma.com/other/rgb/
    SettingsButton settingsButton = new SettingsButton(MODULE_SETTINGS, LocaleUtil.get("module.setting"), mouseEvent -> {
    });
    menuVbox.addBottom(settingsButton);
    return menu;
  }

  private EventHandler<MouseEvent> toolEventHandler() {
    return mouseEvent -> {
      if (toolView.isEmpty()) {
        ContentController contentController = new ContentController();
        MenuController menuController = new MenuController(contentController);
        toolView.add(menuController.getView());
        toolView.add(contentController.getView());
        // 设置初始化的分割位置
        contentPane.setDividerPosition(0, 0.2);
      }
      contentPane.getItems().setAll(toolView);
    };
  }


  private EventHandler<MouseEvent> todoEventHandler() {
    return mouseEvent -> {
      if (todoView.isEmpty()) {
        TodoController menuController = new TodoController();
        todoView.add(menuController.getView());
      }
      contentPane.getItems().setAll(todoView);
    };
  }

}
