package com.meetingroom.dao;

import com.meetingroom.model.Amenity;
import java.util.ArrayList;
import java.util.List;

public class AmenityDAO {
    private List<Amenity> amenities = new ArrayList<>();

    public void addAmenity(Amenity amenity) {
        amenities.add(amenity);
    }

    public List<Amenity> getAllAmenities() {
        return amenities;
    }

    public Amenity getAmenityByName(String name) {
        try {
            return Amenity.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}