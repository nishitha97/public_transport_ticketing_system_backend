package com.csse_we_32.public_transport_ticketing_system.domain;

import java.util.List;

public class TimeTableRow {
    private String id;//homagama/colombo
    //use city name and district name in simple letters
    private String name;
    private String address;
    private List<TimeSlot> timeSlots;
}
