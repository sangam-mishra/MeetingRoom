package com.company.service;

import com.company.dao.RoomDAO;
import com.company.model.MeetingRoom;

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
