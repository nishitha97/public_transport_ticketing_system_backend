package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.security.JwtUser;

import javax.validation.Valid;
import java.util.List;

public interface UserService {
    /**
     * create and save a user object
     *
     * @param user User object
     * @return User object
     */
    User createUser(@Valid User user);

    /**
     * updates user object
     *
     * @param user User object
     * @return updated User
     */
    User updateUser(@Valid User user);

    /**
     *find all users
     *
     * @return  List<User>
     */
    List<User> getAllUsers();

    /**
     *find user based on user id
     *
     * @param userId User id
     * @return User
     */
    User getUser(String userId);

    /**
     *deletes a user based on id
     *
     * @param userId User id
     */
    void deleteUser(String userId);

    JwtUser getJWtUser(String username);

    public User getUserByUserName(String username);
}
