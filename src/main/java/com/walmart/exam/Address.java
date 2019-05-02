package com.walmart.exam;

public class Address {
    private Coordinate latitude;
    private Coordinate longitude;

    public Coordinate getLatitude() {
        return latitude;
    }

    public void setLatitude(Coordinate latitude) {
        this.latitude = latitude;
    }

    public Coordinate getLongitude() {
        return longitude;
    }

    public void setLongitude(Coordinate longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Address{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
