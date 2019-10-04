package com.csse_we_32.public_transport_ticketing_system.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Size;

@Document(collection = "users")
public class User {


    @Id
    private String id;

    private String username;

    private String userFullName;

    private String password;

    private String email;

    private String creditCardNo;

    private String expireDate;
    @Size(max = 11)
    private String nic;

    @Size(max = 11,min = 10)
    private String contactNo;

    private UserType userType;

    private String profileImg;

    private String busStand;

    private  String lastUpdateDate;



    public User(String username,String userFullName, String password, String email, String creditCardNo,String expireDate, @Size(max = 11) String nic,
                @Size(max = 11, min = 10) String contactNo, UserType userType,String profileImg,String busStand,String lastUpdateDate) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.creditCardNo = creditCardNo;
        this.expireDate=expireDate;
        this.nic = nic;
        this.contactNo = contactNo;
        this.userType = userType;
        this.profileImg=profileImg;
        this.userFullName=userFullName;
        this.busStand=busStand;
        this.lastUpdateDate=lastUpdateDate;


    }
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getBusStand() {
        return busStand;
    }

    public void setBusStand(String busStand) {
        this.busStand = busStand;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}
