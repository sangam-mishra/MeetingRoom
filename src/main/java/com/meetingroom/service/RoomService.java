package com.meetingroom.service;

import com.meetingroom.dao.RoomDAO;
import com.meetingroom.model.MeetingRoom;


import java.util.List;

public class RoomService {
    private RoomDAO meetingRoomDAO = new RoomDAO();

    public List<MeetingRoom> getAllMeetingRooms() {
        return meetingRoomDAO.getAllMeetingRooms();
    }

    public void addMeetingRoom(MeetingRoom room) {
        meetingRoomDAO.addMeetingRoom(room);
    }
}
