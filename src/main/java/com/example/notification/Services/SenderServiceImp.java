package com.example.notification.Services;

import com.example.notification.Configrations.CryptoAuth;
import com.example.notification.Entities.Sender;
import com.example.notification.Repositories.SenderRepo;
import com.example.notification.Services.Interfaces.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SenderServiceImp implements SenderService {

    @Autowired  SenderRepo senderRepo;

    @Override
    public void saveSender(Sender sender) {
         senderRepo.save(sender);
    }

    @Override
    public Sender authSender(String cipherUsername, String cipherPassword) throws Exception {

          String username = CryptoAuth.decryptValue(cipherUsername);
          String password =  CryptoAuth.decryptValue(cipherPassword);

          if(senderRepo.existsByUsername(username) && senderRepo.existsByPassword(password))
                 return senderRepo.findByUsername(username);

          throw new Exception("Sender not found please re login");
    }


}
