package com.csse_we_32.public_transport_ticketing_system.domain;


import java.util.Date;

public class JwtToken  {
    String jwttoken;
    Date date;

    public JwtToken(String jwttoken, Date date) {
        this.jwttoken = jwttoken;
        this.date = date;
    }

    public String getJwttoken() {
        return jwttoken;
    }

    public void setJwttoken(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
