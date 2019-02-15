package com.example.notification;

import com.example.notification.Entities.Sender;
import com.example.notification.Entities.Topic;
import com.example.notification.Services.SenderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {



    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);


    }

}

