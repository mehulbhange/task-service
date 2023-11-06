package com.taskmanagementapp.taskservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
@Builder
@Data
@Entity
@Table(name = "tasks")
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    private UUID _id;
    private String name;
    private String description;
    private Long dueDate;
    private Long createDate;
    private Long updateDate;
    private String priority;
    private ArrayList<String> tags;
    //private ArrayList<Task> subtasks;
    //private ArrayList<String> attachments;
    private String assignee;
    private Long reminder;
    private ArrayList<String> notes;
    //private boolean recurring;
    private String project;
    private String status;
    //private int timeEstimate;
    //private ArrayList<Task> dependencies;
    //private ArrayList<String> customFields;
    private ArrayList<String> links;
    //private String location;
}
