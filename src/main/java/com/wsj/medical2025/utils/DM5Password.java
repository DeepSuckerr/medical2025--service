package com.wsj.medical2025.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DM5Password {

    /**
     * MD5加密方法
     * @param input 需要加密的字符串
     * @return 加密后的字符串
     */
    public static String encrypt(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        try {
            // 创建MessageDigest实例
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 将输入字符串转换为字节数组并计算摘要
            byte[] digest = md.digest(input.getBytes());

            // 将字节数组转换为十六进制字符串
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1, 3));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found", e);
        }
    }

    /**
     * 验证密码是否匹配
     * @param input 输入的密码
     * @param encrypted 已加密的密码
     * @return 是否匹配
     */
    public static boolean verify(String input, String encrypted) {
        if (input == null || encrypted == null) {
            return false;
        }

        String encryptedInput = encrypt(input);
        return encryptedInput != null && encryptedInput.equals(encrypted);
    }
}