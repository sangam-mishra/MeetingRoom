package com.meetingroom.dao;

import com.meetingroom.model.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public List<Booking> getBookingsByRoom(String roomName) {
        return bookings.stream()
                .filter(booking -> booking.getRoom().getName().equals(roomName))
                .toList();
    }
}