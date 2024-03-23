package com.mytool.box.controller.todo;

import com.mytool.box.view.component.RootScrollPane;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class TodoController {

  public TodoController() {
  }

  public ScrollPane getView() {
    RootScrollPane diskListRootScrollPane = new RootScrollPane();
    VBox vBox = new VBox();
    vBox.setAlignment(Pos.CENTER);
    vBox.getChildren().add(new Text("Disk Space"));
    diskListRootScrollPane.setContent(vBox);
    return diskListRootScrollPane;
  }

}
