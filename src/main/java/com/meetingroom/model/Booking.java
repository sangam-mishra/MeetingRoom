package com.meetingroom.model;

import java.time.LocalDateTime;

public class Booking {
    private User user;
    private MeetingRoom room;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Booking(User user, MeetingRoom room, LocalDateTime startTime, LocalDateTime endTime) {
        this.user = user;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MeetingRoom getRoom() {
        return room;
    }

    public void setRoom(MeetingRoom room) {
        this.room = room;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
