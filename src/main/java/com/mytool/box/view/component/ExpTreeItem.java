package com.mytool.box.view.component;

import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;

/**
 * A custom TreeItem that allows for expanding and collapsing TreeItems.
 *
 * @param <T> The type of the TreeItem.
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ExpTreeItem<T> extends TreeItem<T> {

  /**
   * set whether the TreeItem is a leaf node.
   */
  private boolean isLeaf = false;

  public ExpTreeItem() {
    super();
  }

  public ExpTreeItem(boolean isLeaf) {
    super();
    this.isLeaf = isLeaf;
  }

  public ExpTreeItem(final T value) {
    super(value);
  }

  public ExpTreeItem(final ObservableValue<T> value) {
    super();
    this.valueProperty().bind(value);
  }

  public ExpTreeItem(final T value, boolean isLeaf) {
    super(value);
    this.isLeaf = isLeaf;
  }

  public ExpTreeItem(final ObservableValue<T> value, final Node graphic) {
    super(null, graphic);
    this.valueProperty().bind(value);
  }

  public ExpTreeItem(final T value, final Node graphic, boolean isLeaf) {
    super(value, graphic);
    this.isLeaf = isLeaf;
  }

  public ExpTreeItem(final ObservableValue<T> value, final Node graphic, boolean isLeaf) {
    super(null, graphic);
    this.valueProperty().bind(value);
    this.isLeaf = isLeaf;
  }

  /**
   * Override the isLeaf method, so that the TreeItem can be expanded
   * even when it has no child nodes.
   */
  @Override
  public boolean isLeaf() {
    return isLeaf;
  }

}
