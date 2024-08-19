package com.meetingroom.dao;

import com.meetingroom.model.MeetingRoom;

import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom room) {
        meetingRooms.add(room);
    }

    public List<MeetingRoom> getAllMeetingRooms() {
        return meetingRooms;
    }

    public MeetingRoom getMeetingRoomByName(String name) {
        return meetingRooms.stream()
                .filter(room -> room.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
