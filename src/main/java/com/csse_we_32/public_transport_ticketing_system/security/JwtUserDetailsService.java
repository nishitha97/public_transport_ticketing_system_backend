package com.csse_we_32.public_transport_ticketing_system.security;


import java.util.ArrayList;
import java.util.List;

import com.csse_we_32.public_transport_ticketing_system.domain.User;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("javainuse".equals(username)) {
			//List<String> list=new ArrayList<>();
			//list.add("admin");
			//return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
			//		new ArrayList<>());
			

			// return new JwtUser("admin", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", "admin",AuthorityUtils.createAuthorityList("ADMIN"));
		    return new User("admin", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6", "nishi@gmail.com", "971711713v",
                    "0789195560", AuthorityUtils.createAuthorityList("ADMIN"));

		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
