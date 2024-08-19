package com.meetingroom.model;

public enum Amenity {
    WHITEBOARD(5),
    PROJECTOR(5),
    WIFI(10),
    CONFERENCE_CALL_FACILITY(15),
    WATER_DISPENSER(5),
    TV(10),
    COFFEE_MACHINE(10);

    private final int cost;

    Amenity(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}