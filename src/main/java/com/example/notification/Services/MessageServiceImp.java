package com.example.notification.Services;

import com.example.notification.Entities.Message;
import com.example.notification.Repositories.MessageRepo;
import com.example.notification.Services.Interfaces.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImp implements MessageService {


    @Autowired
    private MessageRepo messageRepo;

    @Override
    public void saveMessage(Message message) {
          messageRepo.save(message);
    }

}
