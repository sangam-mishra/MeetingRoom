package com.meetingroom.model;

public class User {
    private String name;
    private String email;
    private String phone;
    private Role role; // "Admin", "Manager", "Member"
    private int credits;

    public User(String name, String email, String phone, Role role, int credits) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.credits = role.equals("Manager") ? 2000 : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
