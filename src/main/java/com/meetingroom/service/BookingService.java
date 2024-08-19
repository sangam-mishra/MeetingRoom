package com.meetingroom.service;

import com.meetingroom.dao.BookingDAO;
import com.meetingroom.dao.RoomDAO;
import com.meetingroom.dao.UserDAO;
import com.meetingroom.model.Booking;
import com.meetingroom.model.MeetingRoom;
import com.meetingroom.model.User;

import java.time.Duration;
import java.util.List;

public class BookingService {
    private BookingDAO bookingDAO = new BookingDAO();
    private UserDAO userDAO = new UserDAO();
    private RoomDAO roomDAO = new RoomDAO();

    public void bookMeetingRoom(Booking booking) {
        User user = booking.getUser();
        MeetingRoom room = booking.getRoom();

        // Check if the room is available
        if (room == null) {
            throw new RuntimeException("Room not found");
        }

        int cost = room.getHourlyCost() * (int) Duration.between(booking.getStartTime(), booking.getEndTime()).toHours();
        if (user.getCredits() >= cost) {
            user.setCredits(user.getCredits() - cost);
            bookingDAO.addBooking(booking);
        } else {
            throw new RuntimeException("Not enough credits");
        }
    }

    public List<Booking> getAllBookings() {
        return bookingDAO.getAllBookings();
    }
}