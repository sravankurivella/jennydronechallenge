package com.walmart.exam;

public class Coordinate {
    private Integer number;
    private String direction;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "number=" + number +
                ", direction='" + direction + '\'' +
                '}';
    }
}
