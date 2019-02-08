package com.example.notification.Controllers;


import com.example.notification.Configrations.AES;
import com.example.notification.Entities.Sender;
import com.example.notification.Repositories.SenderRepo;
import com.example.notification.Services.SenderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SenderController  {


    @Autowired SenderServiceImp senderServiceImp;

//    @RequestMapping( value = "/addUser" , method = RequestMethod.POST )
//    public String addSender(@RequestBody Sender sender) {
//
//          senderServiceImp.saveSender(sender);
//          return "sender added successfully";
//    }



    @CrossOrigin("http://localhost:4200")
    @RequestMapping( value = "/authUser" , method = RequestMethod.POST )
    public  Map<String, String> AuthSender(@RequestBody Map<String, ?> inputs) throws Exception {

        
        Sender sender = senderServiceImp.authSender((String) inputs.get("cipherUsername") , (String) inputs.get("cipherPassword")  );
        HashMap<String, String> cardinality = new HashMap<>();
        cardinality.put("name", sender.getName());
        cardinality.put("token",  AES.encrypt(sender.getUsername()+"||"+sender.getPassword()));

        return cardinality;
    }






}
