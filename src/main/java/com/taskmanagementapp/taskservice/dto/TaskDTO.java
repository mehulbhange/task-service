package com.taskmanagementapp.taskservice.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
@Data
public class TaskDTO {

    private String name;
    private String description;
    private Date dueDate;
    private String priority;
    private ArrayList<String> tags;
    private String assignee;
    private Date reminder;
    private ArrayList<String> notes;
    private String project;
    private String status;
    private ArrayList<String> links;

}
