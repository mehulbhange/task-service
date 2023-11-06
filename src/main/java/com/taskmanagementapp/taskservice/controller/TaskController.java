package com.taskmanagementapp.taskservice.controller;

import com.taskmanagementapp.taskservice.dto.TaskDTO;
import com.taskmanagementapp.taskservice.model.Task;
import com.taskmanagementapp.taskservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/task")
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO){
        return taskService.createTask(taskDTO);
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){
        return taskService.getAllTask();
    }

    @DeleteMapping("/task/{_id}")
    public void deleteTask(@PathVariable("_id") UUID _id){
        taskService.deleteTask(_id);
    }

}
