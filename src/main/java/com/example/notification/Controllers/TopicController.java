package com.example.notification.Controllers;
import com.example.notification.Configrations.CryptoAuth;
import com.example.notification.Repositories.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Arrays;
import java.util.Base64;


@RestController
public class TopicController {

    @Autowired TopicRepo topicRepo;

    @RequestMapping( value = "/" , method = RequestMethod.GET )
    public String showTopic() throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {

//        Topic topic = topicRepo.findByName("sales");
//        System.out.println(topic.getName());
        CryptoAuth cryptoAuth =new CryptoAuth();


           return  "";
    }





}


