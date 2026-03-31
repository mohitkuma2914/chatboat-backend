package com.example.chatBoat.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if (message == null) {
            return "I didn't understand";
        }

        message = message.toLowerCase();

        switch (message) {

            case "hi":
                return "Hello 👋";

            case "hello":
                return "Hi there!";

            case "bye":
                return "Goodbye 👋";

            default:
                return "Sorry, I don't understand.";
        }
    }
}