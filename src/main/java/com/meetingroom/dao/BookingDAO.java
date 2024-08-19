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
}
