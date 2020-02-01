package com.stream.test;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * SecurityKeys
 *
 * @author aixuedeyuoO
 * @date 2020/1/21
 */
public class SecurityKeys {
    public static void main(String[] args) {
        druidEncrypt();
    }

    public static void druidEncrypt() {
        try {
            //密码明文
            String password = "12345678";
            System.out.println("明文密码: " + password);
            String[] keyPair = ConfigTools.genKeyPair(512);
            //私钥
            String privateKey = keyPair[0];
            //公钥
            String publicKey = keyPair[1];

            //用私钥加密后的密文
            password = ConfigTools.encrypt(privateKey, password);

            System.out.println("privateKey:" + privateKey);
            System.out.println("publicKey:" + publicKey);

            System.out.println("password:" + password);

            String decryptPassword = ConfigTools.decrypt(publicKey, password);
            System.out.println("解密后:" + decryptPassword);
        } catch (Exception e) {

        }
    }
}
