package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list-- ideally get it from DB
    List<User> userList = List.of(
            new User(1223L,"Ethan Hunt", "6676678963"),
            new User(1345L,"Ludwik Dieter", "8878899909"),
            new User(1432L,"Brad Cage", "5546678932"));

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
