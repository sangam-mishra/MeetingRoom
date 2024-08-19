package com.meetingroom.model;

import java.util.Set;

public class MeetingRoom {
    private String name;
    private int seatingCapacity;
    private Set<Amenity> amenities;
    private int hourlyCost;

    public MeetingRoom(String name, int seatingCapacity, Set<Amenity> amenities) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.amenities = amenities;
        this.hourlyCost = calculateHourlyCost();
    }

    private int calculateHourlyCost() {
        int cost = 0;
        if (seatingCapacity > 5 && seatingCapacity <= 10) cost += 10;
        if (seatingCapacity > 10) cost += 20;
        for (Amenity amenity : amenities) {
            cost += amenity.getCost();
        }
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public Set<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(Set<Amenity> amenities) {
        this.amenities = amenities;
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(int hourlyCost) {
        this.hourlyCost = hourlyCost;
    }
}
