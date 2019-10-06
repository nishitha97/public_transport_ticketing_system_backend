package com.csse_we_32.public_transport_ticketing_system;


import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.domain.UserType;
import com.csse_we_32.public_transport_ticketing_system.repository.UserRepository;
import com.csse_we_32.public_transport_ticketing_system.security.JwtUser;
import com.csse_we_32.public_transport_ticketing_system.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {


    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UserRepository userRepository;

    @Test
    public void testCreateUsers() {
        User user = new User("username", "userFullName", "password", "email",
                "creditcard", "expdate", "976666788V", "022222222", UserType.PASSENGER,
                "imag.jpg", "sampleBusStand", "01-01-2019");
        when(userRepository.save(user)).thenReturn(user);
        User user1 = userService.createUser(user);
        assertEquals("username", user1.getUsername());

    }

    @Test
    public void testGetAllUsers() {

        User user = new User("username", "userFullName", "password", "email",
                "creditcard", "expdate", "976666788V", "022222222", UserType.PASSENGER,
                "imag.jpg", "sampleBusStand", "01-01-2019");

        List<User> userList = new ArrayList<>();
        userList.add(user);

        when(userRepository.findAll()).thenReturn(userList);

        List<User> allUsers = userService.getAllUsers();

        assertEquals(1, allUsers.size());
        assertEquals("username", allUsers.get(0).getUsername());

    }

    @Test
    public void testGetUserByName() {
        User user = new User("username", "userFullName", "password", "email",
                "creditcard", "expdate", "976666788V", "022222222", UserType.PASSENGER,
                "imag.jpg", "sampleBusStand", "01-01-2019");

        when(userRepository.findByUsername("username")).thenReturn(user);
        User user1 = userService.getUserByUserName("username");
        assertEquals("username", user1.getUsername());

    }

    @Test
    public void testGetFreeInspector() {
        User user = new User("username", "userFullName", "password", "email",
                "creditcard", "expdate", "976666788V", "022222222", UserType.PASSENGER,
                "imag.jpg", "sampleBusStand", "01-01-2019");

        List<User> userList = new ArrayList<>();
        userList.add(user);

        when(userRepository.findByBusStandAndLastUpdateDateNot("busStand", "date"))
                .thenReturn(userList);

        List<User> freeInspector = userService.getFreeInspector("busStand", "date");
        assertEquals(1, freeInspector.size());
        assertEquals("username", freeInspector.get(0).getUsername());

    }

    @Test
    public void testGetJWTUser() {
        Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
        User user = new User("username", "userFullName", "password", "email",
                "creditcard", "expdate", "976666788V", "022222222", UserType.PASSENGER,
                "imag.jpg", "sampleBusStand", "01-01-2019");

        JwtUser jwtUser = new JwtUser("username", "password",
                "PASSENGER", authorities);
        when(userRepository.findByUsername("username")).thenReturn(user);

        JwtUser jwtUser2 = userService.getJWtUser("username");
        assertEquals(jwtUser.getUsername(), jwtUser2.getUsername());
        assertEquals(jwtUser.getPassword(), jwtUser2.getPassword());
        assertEquals(jwtUser.getROLE_USER(), jwtUser2.getROLE_USER());
    }


}
