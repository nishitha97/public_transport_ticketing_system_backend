package com.csse_we_32.public_transport_ticketing_system.repository;


import com.csse_we_32.public_transport_ticketing_system.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    /**
     * find user based on username and password provided
     *
     * @param username given username of a user
     * @param password given password of a user
     * @return User
     */
    User findByUsernameAndPassword(String username,String password);
    User findByUsername(String username);




}
