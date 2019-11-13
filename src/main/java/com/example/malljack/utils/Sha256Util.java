package com.example.malljack.utils;

import java.security.MessageDigest;

/**
 * @ClassName Sha256Util
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
public class Sha256Util {
    /**
     * 返回SHA256字符串
     * @param str
     * @return
     */
    public static String getSha256(String str) {
        MessageDigest messageDigest;
        String encodestr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes("UTF-8"));
            encodestr = byte2Hex(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encodestr;
    }

    /**
     * 将bytes转为16进制
     * @param bytes
     * @return
     */
    private static String byte2Hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        String temp = null;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                sb.append("0");
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}
