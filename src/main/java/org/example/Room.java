package org.example;

import java.util.Scanner;

public class Room {
    private int roomNumber ;
    private String type;
    private double pricePerNight;
    private boolean isAvailable;

    public Room() {
    }

    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
    }
Scanner scanner = new Scanner(System.in);
    public boolean bookRoom( boolean bookRoom){

        if (isAvailable){
            return  true;
        }
        return false;
    }

    public void freeRoom(){

        if (isAvailable) {
            System.out.println("доступно");
        } else {
            System.out.println("занят");
        }
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
