package org.mgs.rest2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {
    @Value("${app.message.name}")
    private String messageName;
    @GetMapping
    public String list(){
        return "list: " + messageName;
    }
}
