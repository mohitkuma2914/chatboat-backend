package com.example.chatbot.controller;

import com.example.chatBoat.model.MessageRequest;
import com.example.chatBoat.model.MessageResponse;
import com.example.chatBoat.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        // Log incoming message
        System.out.println("Incoming Message from: " + request.getFrom());
        System.out.println("Message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}