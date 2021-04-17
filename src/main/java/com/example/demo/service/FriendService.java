package com.example.demo.service;

import com.example.demo.model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {
}
