package com.mytool.box.view.component;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;

/**
 * A custom TreeView that allows for expanding and collapsing TreeItems.
 *
 * @param <T> The type of the TreeItem.
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ExpIconTreeView<T> extends TreeView<T> {

  public ExpIconTreeView() {
    super();
    init(false);
  }

  public ExpIconTreeView(boolean showRoot) {
    super();
    init(showRoot);
  }

  public ExpIconTreeView(TreeItem<T> root) {
    super(root);
    init(false);
  }

  public ExpIconTreeView(TreeItem<T> root, boolean showRoot) {
    super(root);
    init(showRoot);
  }

  private void init(boolean showRoot) {
    // disable the arrow icon
    URL resource = getClass().getResource("/css/tree-view.css");
    if (resource != null) {
      this.getStylesheets().add(resource.toExternalForm());
    }
    // set the root visibility
    this.setShowRoot(showRoot);
    // set the cell factory to support expand and collapse by click
    this.setCellFactory(tv -> new ExpTreeCell<>());
  }

}
