package com.csse_we_32.public_transport_ticketing_system.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUser implements UserDetails{

	private String userName;
	private String password;
	private String ROLE_USER;
	private Collection<? extends GrantedAuthority> authorities;
	
	
	
	

	public JwtUser(String userName, String password, String userType,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.userName = userName;
		this.password = password;
		this.ROLE_USER = userType;
		this.authorities = authorities;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setROLE_USER(String ROLE_USER) {
		this.ROLE_USER = ROLE_USER;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getROLE_USER() {
		return ROLE_USER;
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
		return userName;
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
