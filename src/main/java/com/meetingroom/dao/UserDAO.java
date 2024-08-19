package com.meetingroom.dao;

import com.meetingroom.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getEmail(), user);
    }

    public User getUserByEmail(String email) {
        return users.get(email);
    }

    public Map<String, User> getAllUsers() {
        return users;
    }
}
