package com.mytool.box.view.component;

import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import javafx.util.StringConverter;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class KvComboBox<T extends KvComboBoxEntity> extends ComboBox<T> {

  public KvComboBox(){
    super();
    this.setCellFactory(new Callback<>() {
      @Override
      public ListCell<T> call(ListView<T> param) {
        return new ListCell<>() {
          @Override
          protected void updateItem(T item, boolean empty) {
            super.updateItem(item, empty);
            if (item == null || empty) {
              setText(null);
            } else {
              setText(item.getName());
            }
          }
        };
      }
    });

    this.setConverter(new StringConverter<>() {
      @Override
      public String toString(T object) {
        if (object == null) {
          return null;
        } else {
          return object.getName();
        }
      }

      @Override
      public T fromString(String string) {
        // only need to return null here, because the options of ComboBox are not entered by the user
        return null;
      }
    });
  }

}
