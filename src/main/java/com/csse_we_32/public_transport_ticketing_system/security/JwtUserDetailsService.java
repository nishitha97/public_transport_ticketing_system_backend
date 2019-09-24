package com.csse_we_32.public_transport_ticketing_system.security;


import java.util.ArrayList;
import java.util.List;

import com.csse_we_32.public_transport_ticketing_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (userService.getUserByUserName(username)!=null) {
			//List<String> list=new ArrayList<>();
			//list.add("admin");
			//return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
			//		new ArrayList<>());
			return userService.getJWtUser(username);
			// return new JwtUser("admin", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", "admin",AuthorityUtils.createAuthorityList("ADMIN"));
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
