package com.mytool.box.controller.tool;

import com.mytool.box.utils.base.LocaleUtil;
import com.mytool.box.view.component.ExpIconTreeView;
import com.mytool.box.view.component.ExpTreeItem;
import com.mytool.box.view.component.RootScrollPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuController {

  private final TreeItem<String> rootNode = new ExpTreeItem<>();
  private final TreeView<String> treeView = new ExpIconTreeView<>(rootNode);
  private ContentController contentController;

  public MenuController(ContentController contentController) {
    this.contentController = contentController;
  }

  public ScrollPane getView() {
    RootScrollPane diskListRootScrollPane = new RootScrollPane();

    rootNode.setExpanded(true);

    TreeItem<String> favoriteItem = new ExpTreeItem<>(LocaleUtil.get("tool.favourites"));
    rootNode.getChildren().add(favoriteItem);

    TreeItem<String> safeItem = new ExpTreeItem<>(LocaleUtil.get("tool.cyberSecurity"));
    rootNode.getChildren().add(safeItem);
    TreeItem<String> encodeItem = new ExpTreeItem<>("编码和解码");
    safeItem.getChildren().add(encodeItem);
    encodeItem.getChildren().add(new ExpTreeItem<>("Base32", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Base45", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Base58", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Base62", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Base64", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Base85", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("Hex", true));
    encodeItem.getChildren().add(new ExpTreeItem<>("BCD", true));

    TreeItem<String> digestItem = new ExpTreeItem<>("摘要算法");
    safeItem.getChildren().add(digestItem);
    digestItem.getChildren().add(new ExpTreeItem<>("MD2", true));
    digestItem.getChildren().add(new ExpTreeItem<>("MD4", true));
    digestItem.getChildren().add(new ExpTreeItem<>("MD5", true));
    digestItem.getChildren().add(new ExpTreeItem<>("MD6", true));
    digestItem.getChildren().add(new ExpTreeItem<>("SHA-0", true));
    digestItem.getChildren().add(new ExpTreeItem<>("SHA-1", true));
    digestItem.getChildren().add(new ExpTreeItem<>("SHA-2", true));
    digestItem.getChildren().add(new ExpTreeItem<>("SHA-3", true));

    TreeItem<String> formatItem = new ExpTreeItem<>(LocaleUtil.get("tool.formatter"));
    rootNode.getChildren().add(formatItem);
    TreeItem<String> codeFormatItem = new ExpTreeItem<>("代码格式化");
    formatItem.getChildren().add(codeFormatItem);
    codeFormatItem.getChildren().add(new ExpTreeItem<>("JSON格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("JavaScript格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("XML格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("SQL格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("YAML格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("HTML格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("CSS格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("LESS格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("Markdown格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("TypeScript格式化", true));
    codeFormatItem.getChildren().add(new ExpTreeItem<>("GraphQL格式化", true));
    TreeItem<String> codeEncryptItem = new ExpTreeItem<>("代码压缩混淆");
    formatItem.getChildren().add(codeEncryptItem);
    codeEncryptItem.getChildren().add(new ExpTreeItem<>("CSS压缩", true));

    TreeItem<String> textItem = new ExpTreeItem<>(LocaleUtil.get("tool.textTools"));
    rootNode.getChildren().add(textItem);
    TreeItem<String> textManu = new ExpTreeItem<>("文本处理");
    textItem.getChildren().add(textManu);
    textManu.getChildren().add(new ExpTreeItem<>("文本翻转", true));
    textManu.getChildren().add(new ExpTreeItem<>("文字统计", true));

    diskListRootScrollPane.setContent(treeView);
    return diskListRootScrollPane;
  }

}
