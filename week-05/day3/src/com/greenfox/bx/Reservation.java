package com.greenfox.bx;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public class Reservation implements Reservationy {
    private String bookingNum;
    private String date;

    public Reservation(String Dow) {
        setDowBooking(Dow);
        setCodeBooking(randomZeroToZ(8));
    }

    @Override
    public void setDowBooking(String dowBooking) {
        this.date=dowBooking;
    }

    @Override
    public String getDowBooking() {
        return this.date;
    }

    @Override
    public void setCodeBooking(String codeBooking) {
        this.bookingNum=codeBooking;
    }

    @Override
    public String getCodeBooking() {
        return this.bookingNum;
    }

    @Override
    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return true;
    }

    @Override
    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }


    public String toString() {
        return "Booking# " + this.bookingNum + " for " + this.date;
//        return super.toString();
    }

    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String randomZeroToZ(int len) {
        String out = "";

        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }

}
