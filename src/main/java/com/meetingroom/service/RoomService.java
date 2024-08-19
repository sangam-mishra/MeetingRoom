package com.meetingroom.service;

import com.meetingroom.dao.RoomDAO;
import com.meetingroom.model.MeetingRoom;

import java.util.List;

public class RoomService {
    private RoomDAO roomDAO = new RoomDAO();

    public List<MeetingRoom> getAllMeetingRooms() {
        return roomDAO.getAllMeetingRooms();
    }

    public void addMeetingRoom(MeetingRoom room) {
        roomDAO.addMeetingRoom(room);
    }

    public MeetingRoom getMeetingRoomByName(String name) {
        return roomDAO.getMeetingRoomByName(name);
    }
}