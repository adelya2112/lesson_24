package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Room room = new Room(1, "Гостиница", 10000);


        Guest guest = new Guest("Аделя", 1);

        Booking booking = new Booking(room, guest, "2024-06-10","2024-06-20");

        guest.addBooking(booking);


    }
}