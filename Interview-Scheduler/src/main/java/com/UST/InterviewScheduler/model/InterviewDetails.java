package com.UST.InterviewScheduler.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "interview_tab")
public class InterviewDetails {

    @Id
    @GeneratedValue

    private int id;
    private String intervieweeName;
    private String intervieweeEmail;
    private String intervieweePhoneNo;
    private String intervieweeSkills;
    private String intervieweeExperience;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date interviewDate;

    private String interviewTime;
    private String interviewLink;
    private String pointOfContact;

}
