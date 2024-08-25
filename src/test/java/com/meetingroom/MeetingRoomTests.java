package com.meetingroom;

import com.meetingroom.dao.CreditDAO;
import com.meetingroom.dao.RoomDAO;
import com.meetingroom.dao.UserDAO;
import com.meetingroom.model.*;
import com.meetingroom.service.BookingService;
import com.meetingroom.service.CreditService;
import com.meetingroom.service.RoomService;
import com.meetingroom.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MeetingRoomTests {
    private BookingService bookingService;
    private UserDAO userDAO;
    private RoomDAO roomDAO;
    private CreditService creditService;
    private CreditDAO creditDAO;
    private RoomService roomService;
    private UserService userService;

    @BeforeEach
    void setUp() {
        bookingService = new BookingService();
        userDAO = new UserDAO();
        roomDAO = new RoomDAO();
        creditService = new CreditService();
        creditDAO = new CreditDAO();
        roomService = new RoomService();
        userService = new UserService();

    }
//This testCase checks that is the booking being confirmed and the credit is diducted accurately
    @Test
    void bookMeetingRoom_SuccessfulBooking() {
        User user = new User("John", "john@gmail.com", "1234567890", Role.MANAGER);
        Set<Amenity> amenities = Set.of(Amenity.WHITEBOARD, Amenity.PROJECTOR, Amenity.WIFI);
        MeetingRoom room = new MeetingRoom("Room A", 20, amenities);
        Booking booking = new Booking(user, room, LocalDateTime.of(2024, 8, 25, 14, 0), LocalDateTime.of(2024, 8, 25, 16, 0));

        assertDoesNotThrow(() -> bookingService.bookMeetingRoom(booking));
        //Checking that the credits diducted
        assertEquals(1920, user.getCredits());
    }

    // this test finds wether the person booking the meeting room has enough credits , in place of manager if member is given it returns exceptions

    @Test
    void bookMeetingRoom_NotEnoughCredits() {
        User user = new User("Bob", "bob@gmail.com", "1234567890", Role.MEMBER);
        MeetingRoom room = new MeetingRoom("Room B", 30, Set.of(Amenity.CONFERENCE_CALL_FACILITY, Amenity.TV));
        Booking booking = new Booking(user, room, LocalDateTime.of(2024, 8, 25, 14, 0), LocalDateTime.of(2024, 8, 25, 16, 0));

        assertThrows(RuntimeException.class, () -> bookingService.bookMeetingRoom(booking));
    }

        @Test
        void testResetCreditsForManagers() {
            // Create some sample users (you can adjust these as needed)
            User manager1 = new User("Manager1", "manager1@example.com", "1234567890", Role.MANAGER);

            Set<Amenity> amenities = Set.of(Amenity.WHITEBOARD, Amenity.PROJECTOR, Amenity.WIFI);
            MeetingRoom room = new MeetingRoom("Room A", 20, amenities);
            Booking booking = new Booking(manager1, room, LocalDateTime.of(2024, 8, 25, 14, 0), LocalDateTime.of(2024, 8, 25, 16, 0));

            assertDoesNotThrow(() -> bookingService.bookMeetingRoom(booking));

            //firstly we will deduct the credits and then reset it afterwards
            assertEquals(1920, manager1.getCredits());


            // Call the method to reset credits for managers
            creditService.resetCreditsForManagers();

            // Verify that credits are set to 2000 for both managers
            assertEquals(2000, manager1.getCredits());

        }

        @Test
        void testGetAllMeetingRooms() {
            // Add some sample meeting rooms (you can adjust these as needed)
            Set<Amenity> amenities = Set.of(Amenity.WHITEBOARD, Amenity.PROJECTOR, Amenity.WIFI);
            MeetingRoom room1 = new MeetingRoom("Room A", 20, amenities);

            MeetingRoom room2 = new MeetingRoom("Room B", 30,amenities);
            roomDAO.addMeetingRoom(room1);
            roomDAO.addMeetingRoom(room2);
            assertEquals(2, roomService.getAllMeetingRooms().size());

        }

        @Test
        void testGetMeetingRoomByName() {
            // Add a sample meeting room (you can adjust this as needed)
            Set<Amenity> amenities = Set.of(Amenity.WHITEBOARD, Amenity.PROJECTOR, Amenity.WIFI);
            MeetingRoom room = new MeetingRoom("Room C", 25,amenities);
            roomDAO.addMeetingRoom(room);

            MeetingRoom retrievedRoom = roomService.getMeetingRoomByName("Room C");
            assertNotNull(retrievedRoom);
            assertEquals("Room C", retrievedRoom.getName());

        }

        @Test
        void testGetUserByEmail() {
            // Add a sample user
            User user = new User("John", "john@example.com", "1234567890", Role.MANAGER);
            userDAO.addUser(user);

            User retrievedUser = userService.getUserByEmail("john@example.com");
            assertNotNull(retrievedUser);
            assertEquals("John", retrievedUser.getName());

        }

        @Test
        void testAddUser() {
            // Create a new user (you can adjust this as needed)
            User newUser = new User("Alice", "alice@example.com", "9876543210", Role.MEMBER);

            userService.addUser(newUser);

            // Verify that the user was added successfully
            User addedUser = userDAO.getUserByEmail("alice@example.com");
            assertNotNull(addedUser);
            assertEquals("Alice", addedUser.getName());

        }
    }




