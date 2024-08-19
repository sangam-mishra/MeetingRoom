package com.meetingroom.service;

import com.meetingroom.dao.UserDAO;
import com.meetingroom.model.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public User getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
