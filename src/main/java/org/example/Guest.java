package org.example;

public class Guest {
    private String name ;
    private int guestId;
    private Booking[] bookings = new Booking[5];

    public Guest() {
    }

    public Guest(String name, int guestId) {
        this.name = name;
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    int a = 0;
    public void addBooking(Booking booking){
        for (int i = 0; i < bookings.length; i++) {
            if (a < bookings.length){
                bookings[a] = booking;
                a++;
            }
        }
        System.out.println(a);
    }

}
