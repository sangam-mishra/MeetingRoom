package com.company.service;

import com.company.dao.UserDAO;
import com.company.model.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public User getUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
