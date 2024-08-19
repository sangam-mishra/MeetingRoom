package com.meetingroom.model;

import java.time.LocalDateTime;

public class Schedule {
    private MeetingRoom room;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private BookingStatus status;

    public Schedule(MeetingRoom room, LocalDateTime startTime, LocalDateTime endTime, BookingStatus status) {
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
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

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}