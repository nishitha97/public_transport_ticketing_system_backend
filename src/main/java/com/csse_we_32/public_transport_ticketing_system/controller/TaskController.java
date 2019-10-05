package com.csse_we_32.public_transport_ticketing_system.controller;


import com.csse_we_32.public_transport_ticketing_system.domain.Task;
import com.csse_we_32.public_transport_ticketing_system.domain.User;
import com.csse_we_32.public_transport_ticketing_system.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping()
    public ResponseEntity<List<Task>> getTasks() {

        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());

    }

    @PostMapping("/save")
    public ResponseEntity<Task> save(Task task) {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.save(task));

    }
}
