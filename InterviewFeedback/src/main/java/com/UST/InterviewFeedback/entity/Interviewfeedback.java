package com.UST.InterviewFeedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interviewfeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String userId;
    private String candidateName;
    private String position;
    private String interviewerName;

    private String interviewerEmpId;
    private int rating;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getInterviewerEmpId() {
        return interviewerEmpId;
    }

    public void setInterviewerEmpId(String interviewerEmpId) {
        this.interviewerEmpId = interviewerEmpId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Interviewfeedback(Long id, String userId, String candidateName, String position, String interviewerName, String interviewerEmpId, int rating, String status) {
        this.id = id;
        this.userId = userId;
        this.candidateName = candidateName;
        this.position = position;
        this.interviewerName = interviewerName;
        this.interviewerEmpId = interviewerEmpId;
        this.rating = rating;
        this.status = status;
    }

    public Interviewfeedback()
    {

    }
}
