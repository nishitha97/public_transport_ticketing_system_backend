package com.csse_we_32.public_transport_ticketing_system.controller;

import com.csse_we_32.public_transport_ticketing_system.domain.JwtToken;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.domain.UserType;
import com.csse_we_32.public_transport_ticketing_system.security.*;
import com.csse_we_32.public_transport_ticketing_system.service.AuthService;
import com.csse_we_32.public_transport_ticketing_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
   AuthService authService;
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    /**
     * controller for creating a new user
     *
     * @param user User object
     * @return ResponseEntity containing the created user
     */
    @PostMapping("/passenger")
    public ResponseEntity<?>  addPassenger(@Valid @RequestBody User user) throws Exception {
        user.setUserType(UserType.PASSENGER);
        String password=user.getPassword();
       userService.createUser(user);
        return authService.createAuthenticationToken(new JwtRequest(user.getUsername(),password));


    }

    @PutMapping("/passenger")
    public ResponseEntity<?>  updatePassenger(@Valid @RequestBody User user) throws Exception {
        user.setUserType(UserType.PASSENGER);
        String password=user.getPassword();
        userService.createUser(user);
        return authService.createAuthenticationToken(new JwtRequest(user.getUsername(),password));


    }

    @PostMapping("/getUserByToken")
    public ResponseEntity<User>  getUserByToken(@RequestBody JwtToken jwtToken
                                             ) throws Exception {
        String userName=jwtTokenUtil.getUsernameFromToken(jwtToken.getJwttoken());
        User user=userService.getUserByUserName(userName);
        user.setPassword(null);
        return ResponseEntity.status(HttpStatus.OK).body(user);


    }
    @PostMapping("/inspector")
    public ResponseEntity<User> addInspector(@Valid @RequestBody User user) {
        user.setUserType(UserType.INSPECTOR);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));

    }

    /**
     * controller to update a user
     *
     * @param user User object
     * @return ResponseEntity containing the updated user
     */
    @PutMapping()
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {

        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user));

    }

    /**
     * controller to return all users available
     *
     * @return ResponseEntity containing the list of users
     */
    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());

    }

    /**
     * controller to find and return a specific user based on the user id
     *
     * @param userId User id
     * @return ResponseEntity containing the list of users
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getAUser(@PathVariable("userId") String userId) {


        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(userId));

    }
    /*
    date shoud be day-mont-year

     */

    @GetMapping("/{busStand}/{date}")
    public ResponseEntity<List<User>> getFreeInspecters(@PathVariable("busStand") String busStand,@PathVariable("date") String date) {


        return ResponseEntity.status(HttpStatus.OK).body(userService.getFreeInspector(busStand,date));

    }

    /**
     * controller to delete a specific user given the id
     *
     * @param userId User id
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteAUser(@PathVariable("userId") String userId) {

        userService.deleteUser(userId);

    }


    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}



