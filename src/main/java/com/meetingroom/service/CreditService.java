package com.meetingroom.service;

import com.meetingroom.dao.CreditDAO;
import com.meetingroom.model.Role;
import com.meetingroom.model.User;

import java.util.Map;

public class CreditService {
    private CreditDAO creditDAO = new CreditDAO();

    public void resetCreditsForManagers() {
        Map<String, User> users = creditDAO.getAllUsers();
        users.values().stream()
                .filter(user -> user.getRole() == Role.MANAGER)
                .forEach(user -> user.setCredits(2000));
    }
}