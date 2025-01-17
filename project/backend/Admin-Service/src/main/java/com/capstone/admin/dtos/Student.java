package com.capstone.admin.dtos;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentEmail;
    private String TrainingRoom;
    private int Totalduration;
    private List<Marks> marks;
    private FeedBack feedback;
    private List<Attendence> attendences;
}
