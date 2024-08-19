package com.meetingroom.service;

import com.meetingroom.dao.UserDAO;
import com.meetingroom.model.User;

import java.util.Map;

public class CreditService {
    private UserDAO userDAO = new UserDAO();

    /**
     * Resets credits for all managers to 2000 on Monday morning at 6 AM.
     */
    public void resetCreditsForManagers() {
        Map<String, User> users = userDAO.getAllUsers();
        users.values().stream()
                .filter(user -> "Manager".equals(user.getRole()))
                .forEach(user -> user.setCredits(2000));
    }
}
