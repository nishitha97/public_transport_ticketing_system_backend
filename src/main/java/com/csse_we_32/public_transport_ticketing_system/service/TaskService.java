package com.csse_we_32.public_transport_ticketing_system.service;

import com.csse_we_32.public_transport_ticketing_system.domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task save(Task task);
}
