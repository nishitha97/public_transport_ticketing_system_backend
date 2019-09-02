package com.csse_we_32.public_transport_ticketing_system.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Size;

@Document(collection = "users")
public class User {


    @Id
    private String id;

    
    public String getId() {
        return id;
    }

    private String username;

    private String password;

    private String email;

    private String creditCardNo;

    @Size(max = 11)
    private String nic;

    @Size(max = 11,min = 10)
    private String contactNo;
    
    private UserType userType;

    
    
    
    public User(String username, String password, String email, String creditCardNo, @Size(max = 11) String nic,
			@Size(max = 11, min = 10) String contactNo, UserType userType) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.creditCardNo = creditCardNo;
		this.nic = nic;
		this.contactNo = contactNo;
		this.userType = userType;
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
    
    
}
