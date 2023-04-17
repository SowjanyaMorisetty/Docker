package com.UST.InterviewFeedback.dto;

public class InterviewfeedbackDTO  {
    private Long id;
    private String userId;
    private String candidateName;
    private String position;
    private String interviewerName;
    private String interviewerEmpId;
    private int rating;
    private String status;

    public InterviewfeedbackDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return this.candidateName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getInterviewerName() {
        return this.interviewerName;
    }

    public void setInterviewerEmpId(String interviewerEmpId) {
        this.interviewerEmpId = interviewerEmpId;
    }

    public String getInterviewerEmpId() {
        return this.interviewerEmpId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}