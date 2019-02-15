package com.example.notification.Services.Interfaces;

import com.example.notification.Entities.Sender;

public interface SenderService  {

    void saveSender(Sender sender);
    Sender authSender(String username , String password ) throws Exception;
    String existSender(String token);
}
