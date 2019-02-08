package com.example.notification.Controllers;


import com.example.notification.Entities.Sender;
import com.example.notification.Repositories.SenderRepo;
import com.example.notification.Services.SenderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController  {


    @Autowired SenderServiceImp senderServiceImp;
    @Autowired SenderRepo senderRepo;

    @RequestMapping( value = "/addUser" , method = RequestMethod.POST )
    public String showTopic(@RequestBody Sender sender) {

          senderServiceImp.saveSender(sender);
          return "sender added successfully";
    }



}
