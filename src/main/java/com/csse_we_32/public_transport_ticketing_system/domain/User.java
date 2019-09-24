package com.csse_we_32.public_transport_ticketing_system.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.Size;
import java.util.Collection;

@Document(collection = "users")
public class User implements UserDetails {


    @Id
    private String id;

    
    public String getId() {
        return id;
    }

    private String username;

    private String password;

    private String email;

   // private String creditCardNo;

    @Size(max = 11)
    private String nic;

    @Size(max = 11,min = 10)
    private String contactNo;
    
   // private UserType userType;

    private Collection<? extends GrantedAuthority> authorities;//type

    
    
    
    public User(String username, String password, String email, @Size(max = 11) String nic,
			@Size(max = 11, min = 10) String contactNo, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		//this.creditCardNo = creditCardNo;
		this.nic = nic;
		this.contactNo = contactNo;
		//this.userType = userType;
		this.authorities=authorities;
	}



    public void setUsername(String username) {
        this.username = username;
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


//    public String getCreditCardNo() {
//        return creditCardNo;
//    }
//
//    public void setCreditCardNo(String creditCardNo) {
//        this.creditCardNo = creditCardNo;
//    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

//	public UserType getUserType() {
//		return userType;
//	}
//
//	public void setUserType(UserType userType) {
//		this.userType = userType;
//	}

	public void setId(String id) {
		this.id = id;
	}

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return authorities;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return password;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }




    
    
}
