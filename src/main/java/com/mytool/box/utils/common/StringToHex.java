package com.mytool.box.utils.common;

import java.io.UnsupportedEncodingException;

/**
 * @author adolphor <0haizhu0@gmail.com>
 */
public class StringToHex {

  /**
   * 字符串转换为16进制字符串
   *
   * @param str
   * @return
   */
  public static String stringToHex(String str) {
    String hex = "";
    for (int i = 0; i < str.length(); i++) {
      int ch = str.charAt(i);
      String hs = Integer.toHexString(ch);
      hex = hex + hs;
    }
    return hex;
  }

  /**
   * 16进制字符串转换为字符串
   *
   * @param hex
   * @return
   */
  public static String hexToString(String hex) throws UnsupportedEncodingException {
    if (hex == null || hex.equals("")) {
      return null;
    }
    hex = hex.replace(" ", "");
    byte[] baKeyword = new byte[hex.length() / 2];
    for (int i = 0; i < baKeyword.length; i++) {
      baKeyword[i] = (byte) (0xff & Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16));
    }
    hex = new String(baKeyword, "UTF-8");
    return hex;
  }

  /**
   * 16进制表示的字符串转换为字节数组
   *
   * @param str 16进制表示的字符串
   * @return byte[] 字节数组
   */
  public static byte[] hexToBytes(String str) {
    int len = str.length();
    byte[] b = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
      // 两位一组，表示一个字节,把这样表示的16进制字符串，还原成一个字节
      b[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character
          .digit(str.charAt(i + 1), 16));
    }
    return b;
  }

  /**
   * byte数组转16进制字符串
   *
   * @param bytes
   * @return
   */
  public static String bytesToHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder(bytes.length);
    String sTemp;
    for (byte aByte : bytes) {
      sTemp = Integer.toHexString(0xFF & aByte);
      if (sTemp.length() < 2) {
        sb.append(0);
      }
      sb.append(sTemp.toUpperCase());
    }
    return sb.toString();
  }

}