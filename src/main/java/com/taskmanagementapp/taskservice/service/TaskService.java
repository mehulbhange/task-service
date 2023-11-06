package com.taskmanagementapp.taskservice.service;

import com.taskmanagementapp.taskservice.dto.TaskDTO;
import com.taskmanagementapp.taskservice.model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface TaskService {

    public ResponseEntity<TaskDTO> createTask(TaskDTO taskDTO);

    public ResponseEntity<TaskDTO> updateTask(TaskDTO taskDTO);
    public void deleteTask(UUID _id);
    public ResponseEntity<List<Task>> getAllTask();
    public ResponseEntity<TaskDTO> getTaskById(UUID _id);

}
