package com.mytool.box.view.component;

import javafx.geometry.Insets;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;

/**
 * A custom TreeCell that allows for expanding and collapsing TreeItems.
 *
 * @param <T> The type of the TreeItem.
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ExpTreeCell<T> extends TreeCell<T> {

  /**
   * Add the setOnMouseClicked method, so that even when the same item is clicked,
   * it expands and collapses.
   */
  public ExpTreeCell() {
    super();
    this.setOnMouseClicked(mouseEvent -> {
      TreeItem<T> item = getTreeItem();
      if (item != null && !item.isLeaf()) {
        item.setExpanded(!item.isExpanded());
      }
    });
  }

  /**
   * fix treeView node text is not displayed
   *
   * @param item  The new item for the cell.
   * @param empty whether or not this cell represents data from the list. If it
   *              is empty, then it does not represent any domain data, but is a cell
   *              being used to render an "empty" row.
   */
  @Override
  protected void updateItem(T item, boolean empty) {
    super.updateItem(item, empty);
    // set the padding of the cell: 5px
    setPadding(new Insets(5, 0, 5, 0));
    if (empty || item == null) {
      setText(null);
      setGraphic(null);
    } else {
      // display the text and icon of the treeItem
      TreeItem<T> treeItem = getTreeItem();
      if (treeItem != null && treeItem.getGraphic() != null) {
        setGraphic(treeItem.getGraphic());
      }
      setText(item.toString());
    }
  }

}