package com.csse_we_32.public_transport_ticketing_system.domain;

public class JwtToken {
    String jwttoken;

    public JwtToken(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getJwttoken() {
        return jwttoken;
    }

    public void setJwttoken(String jwttoken) {
        this.jwttoken = jwttoken;
    }
}
