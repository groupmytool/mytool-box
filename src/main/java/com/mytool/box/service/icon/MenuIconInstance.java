package com.mytool.box.service.icon;

import javafx.scene.image.Image;

import java.util.Objects;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class MenuIconInstance {

  public final static Image FOLDER_LOCK = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/folder-lock.png")));
  public final static Image FOLDER_OPEN = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/folder-open.png")));

  public final static Image MODULE_TOOLS = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-tools.png")));
  public final static Image MODULE_MANUALS = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-manuals.png")));
  public final static Image MODULE_NOTES = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-notes.png")));
  public final static Image MODULE_RESOURCES = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-resources.png")));
  public final static Image MODULE_AI_LAB = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-ai-lab.png")));
  public final static Image MODULE_SETTINGS = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/module/module-settings.png")));

  public final static Image TOOLS_QA = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-qa.png")));
  public final static Image TOOLS_CODE = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-code.png")));
  public final static Image TOOLS_SWAP = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-swap.png")));
  public final static Image TOOLS_ENCODE = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-encode.png")));
  public final static Image TOOLS_DECODE = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-decode.png")));
  public final static Image TOOLS_ENCODE_DECODE = new Image(Objects.requireNonNull(MenuIconInstance.class.getResourceAsStream("/images/icon/tools/tools-encode-decode.png")));

}
