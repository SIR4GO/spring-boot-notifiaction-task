package com.example.notification.Controllers;


import com.example.notification.Entities.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class ChatController {


	@Autowired
	private SimpMessageSendingOperations messagingTemplate;


	private MessageHeaders createHeaders(String sessionId) {
		SimpMessageHeaderAccessor headerAccessor = SimpMessageHeaderAccessor.create(SimpMessageType.MESSAGE);
		headerAccessor.setSessionId(sessionId);
		headerAccessor.setLeaveMutable(true);
		return headerAccessor.getMessageHeaders();
	}

	@CrossOrigin(origins = "*")
	@MessageMapping("/chat1") // for send  => /app/chat
	@SendTo("/topic1/public1") // for subscribe
	public ChatMessage register(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor ) {

		// System.out.println( headerAccessor.getSessionId());
		headerAccessor.getSessionAttributes().put(chatMessage.getSender() , headerAccessor.getSessionId() );

		System.out.println(chatMessage);
		return chatMessage;
	}

	@CrossOrigin(origins = "*")
	@MessageMapping("/business") // for send  => /app/chat
	@SendTo("/pi/all") // for subscribe
	public ChatMessage topic2(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {

		// System.out.println( headerAccessor.getSessionId());
		headerAccessor.getSessionAttributes().put(chatMessage.getSender() , headerAccessor.getSessionId() );

		return chatMessage;
	}
//
//	@CrossOrigin(origins = "*")
//	@MessageMapping("/chat3") // for send  => /app/chat3
//	@SendToUser("/queue/error") // for subscribe
//	public void topic3(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
//
//		// System.out.println( headerAccessor.getSessionId());
//		headerAccessor.getSessionAttributes().put(chatMessage.getSender() , headerAccessor.getSessionId() );
//
//		String sessionId = headerAccessor.getSessionId();
//		messagingTemplate.convertAndSendToUser(sessionId,"/queue/error","tests", createHeaders(sessionId));
//
//	}


}
