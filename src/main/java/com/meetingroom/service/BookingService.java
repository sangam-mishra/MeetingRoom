package com.meetingroom.service;

import com.meetingroom.dao.BookingDAO;
import com.meetingroom.model.Booking;
import com.meetingroom.model.User;

import java.util.List;

public class BookingService {
    private BookingDAO bookingDAO = new BookingDAO();

    public void bookMeetingRoom(Booking booking) {
        User user = booking.getUser();
        int cost = booking.getRoom().getHourlyCost() * (int) java.time.Duration.between(booking.getStartTime(), booking.getEndTime()).toHours();
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
