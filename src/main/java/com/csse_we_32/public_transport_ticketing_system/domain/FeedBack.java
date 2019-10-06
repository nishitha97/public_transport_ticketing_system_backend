package com.csse_we_32.public_transport_ticketing_system.domain;

import org.springframework.data.annotation.Id;

public class FeedBack {
    @Id
    String id;
    String comment;
    double rate;

    public FeedBack(String id, String comment, double rate) {
        this.id = id;
        this.comment = comment;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
