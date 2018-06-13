package com.hson.core.security;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * Singleton que contiene el encryptor de la libreria Jasypt para encriptar
 * claves en los properties.
 *
 * Created by Hyun Woo Son on 2/1/18
 **/
public class ValueEncoderDecoder {



    private static final String ALGORITHM = "PBEWithMD5AndTripleDES";

    @Value("${secret.key}")
    private String SECRET_KEY;

    private StandardPBEStringEncryptor encryptor;

    public ValueEncoderDecoder(){

    }


    @PostConstruct
    private void init(){
        encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(SECRET_KEY);
        encryptor.setAlgorithm(ALGORITHM);
    }

    public String encode(String value){
      return  encryptor.encrypt(value);
    }

    public String decode(String encryptedValue){
        return encryptor.decrypt(encryptedValue);
    }

}
