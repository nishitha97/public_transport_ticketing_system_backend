package com.csse_we_32.public_transport_ticketing_system.DataClasses;

import com.csse_we_32.public_transport_ticketing_system.domain.Seat;

import java.util.Date;
import java.util.List;

public class SeatSaveData {
    Date date;
    List<Seat> seats;

    public SeatSaveData(Date date, List<Seat> seats) {
        this.date = date;
        this.seats = seats;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
