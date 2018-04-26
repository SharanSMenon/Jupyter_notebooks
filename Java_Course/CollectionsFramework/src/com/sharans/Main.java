package com.sharans;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Sharan Theater", 5, 6);
        theater.getSeats();
        theater.reserveSeat("D05");
        theater.reserveSeat("D05");
    }
}
