package com.csse_we_32.public_transport_ticketing_system.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csse_we_32.public_transport_ticketing_system.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByInspectorId(String s);
    Optional<Task> findByInspectorId(String inspecterId, Date date);
    List<Task> findByDateAndBusStand(String date, String busStand);

}
