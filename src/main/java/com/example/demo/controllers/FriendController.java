package com.example.demo.controllers;

import com.example.demo.model.Friend;
import com.example.demo.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    @Autowired
    FriendService friendService;

    @PostMapping("/friend")
    Friend create(@RequestBody Friend friend){
        return  friendService.save(friend);
    }

    @GetMapping("/friend")
    Iterable<Friend> read(){
        return friendService.findAll();
    }
}
