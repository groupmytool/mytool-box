package com.mytool.box.view.menu;

import com.mytool.box.utils.base.LocaleUtil;
import com.mytool.box.view.component.KvComboBox;
import com.mytool.box.view.component.KvComboBoxEntity;
import com.mytool.box.view.component.PaneDialogLabel;
import com.mytool.box.view.component.VgrowVBox;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class SettingsPane extends VgrowVBox {

  public SettingsPane() {
    super(Pos.CENTER);
    this.setPrefWidth(500);
    this.setPrefHeight(300);
    HBox languageBox = new HBox();
    languageBox.setSpacing(10);

    Label languageLabel = new PaneDialogLabel(LocaleUtil.get("module.language"));

    // 创建一个下拉菜单
    KvComboBox<KvComboBoxEntity> languageSelection = new KvComboBox<>();

    // 添加选项
    languageSelection.getItems().addAll(
        new KvComboBoxEntity("English", "en"),
        new KvComboBoxEntity("Chinese", "zh")
    );

    // 设置默认选项
    languageSelection.setValue(new KvComboBoxEntity("English", "en"));

    languageBox.getChildren().addAll(languageSelection);
    this.getChildren().add(languageBox);
  }

}
