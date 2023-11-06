package com.taskmanagementapp.taskservice.service.impl;

import com.taskmanagementapp.taskservice.dto.TaskDTO;
import com.taskmanagementapp.taskservice.model.Task;
import com.taskmanagementapp.taskservice.repository.TaskRepository;
import com.taskmanagementapp.taskservice.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {

    ArrayList<Task> tasks = new ArrayList<>();

    @Autowired
    private TaskRepository taskRepo;

    @Override
    public ResponseEntity<TaskDTO> createTask(TaskDTO taskDTO) {

        UUID id = UUID.randomUUID();
        Long createDate = System.currentTimeMillis();

        Task task = Task.builder()._id(id)
                .name(taskDTO.getName())
                .description(taskDTO.getDescription())
                .dueDate(taskDTO.getDueDate().getTime())
                .priority(taskDTO.getPriority())
                .tags(taskDTO.getTags())
                .assignee(taskDTO.getAssignee())
                .reminder(taskDTO.getReminder().getTime())
                .notes(taskDTO.getNotes())
                .project(taskDTO.getProject())
                .status(taskDTO.getStatus())
                .links(taskDTO.getLinks())
                .createDate(createDate)
                .updateDate(createDate)
                .build();

        Task t1 = taskRepo.save(task);

        log.info("Stored in db {}",t1);

        return new ResponseEntity<>(taskDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<TaskDTO> updateTask(TaskDTO taskDTO) {
        return null;
    }

    @Override
    public void deleteTask(UUID _id) {
        Optional<Task> task = taskRepo.findById(_id);
        if (task.isPresent())
            taskRepo.deleteById(_id);
    }

    @Override
    public ResponseEntity<List<Task>> getAllTask() {
        List<Task> tasks = taskRepo.findAll();
        return new ResponseEntity<>( tasks, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TaskDTO> getTaskById(UUID _id) {
        return null;
    }
}
