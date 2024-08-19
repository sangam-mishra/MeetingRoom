package com.meetingroom.model;

import java.util.List;

public class MeetingRoom {
    private String name;
    private int seatingCapacity;
    private List<String> amenities;
    private int hourlyCost;

    public MeetingRoom(String name, int seatingCapacity, List<String> amenities) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.amenities = amenities;
        this.hourlyCost = calculateHourlyCost();
    }

    private int calculateHourlyCost() {
        int cost = 0;
        if (seatingCapacity > 5 && seatingCapacity <= 10) cost += 10;
        if (seatingCapacity > 10) cost += 20;
        if (amenities.contains("Projector")) cost += 5;
        if (amenities.contains("WiFi Connection")) cost += 10;
        if (amenities.contains("Conference call facility")) cost += 15;
        if (amenities.contains("Whiteboard")) cost += 5;
        if (amenities.contains("Water Dispenser")) cost += 5;
        if (amenities.contains("TV")) cost += 10;
        if (amenities.contains("Cofffe Machine")) cost += 10;
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

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(int hourlyCost) {
        this.hourlyCost = hourlyCost;
    }
}
