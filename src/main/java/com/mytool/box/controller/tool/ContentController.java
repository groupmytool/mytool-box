package com.mytool.box.controller.tool;

import com.mytool.box.utils.base.LocaleUtil;
import com.mytool.box.view.component.ControlButton;
import com.mytool.box.view.component.ControlHBox;
import com.mytool.box.view.component.RootScrollPane;
import com.mytool.box.view.component.VgrowVBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_CODE;
import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_DECODE;
import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_ENCODE;
import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_ENCODE_DECODE;
import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_QA;
import static com.mytool.box.service.icon.MenuIconInstance.TOOLS_SWAP;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class ContentController {

  public ScrollPane getView() {
    RootScrollPane diskListRootScrollPane = new RootScrollPane();
    VBox content = new VgrowVBox(Pos.TOP_CENTER);
    ControlHBox title = new ControlHBox();
    Button code = new ControlButton(TOOLS_ENCODE_DECODE, LocaleUtil.get("tool.encodeDecode"));
    Button doc = new ControlButton(TOOLS_CODE, LocaleUtil.get("tool.code"));
    Button qa = new ControlButton(TOOLS_QA, LocaleUtil.get("tool.qa"));
    title.addLeft(code).addRight(doc).addRight(qa);
    TextArea inputTextArea = new TextArea();
    ControlHBox control = new ControlHBox();
    Button encode = new ControlButton(TOOLS_ENCODE, LocaleUtil.get("tool.encode"));
    Button decode = new ControlButton(TOOLS_DECODE, LocaleUtil.get("tool.decode"));
    Button swap = new ControlButton(TOOLS_SWAP, LocaleUtil.get("tool.swap"));
    control.addLeft(encode).addLeft(decode).addLeft(swap);
    TextArea outputTextArea = new TextArea();
    content.getChildren().addAll(title, inputTextArea, control, outputTextArea);
    VBox.setVgrow(outputTextArea, Priority.ALWAYS);
    diskListRootScrollPane.setContent(content);
    return diskListRootScrollPane;
  }

}
