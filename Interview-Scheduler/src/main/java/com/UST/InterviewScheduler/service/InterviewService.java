package com.UST.InterviewScheduler.service;

import com.UST.InterviewScheduler.model.InterviewDetails;
import com.UST.InterviewScheduler.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

@Autowired
private InterviewRepository interviewRepository;



    public InterviewDetails createInterviewDetails(InterviewDetails interviewDetails) {
        return interviewRepository.save(interviewDetails);
    }

    public List<InterviewDetails> getInterviewDetails() {
        return interviewRepository.findAll();
    }

    public InterviewDetails getInterviewDetailsById(int id) {
        return interviewRepository.findById(id).orElse(null);
    }



}
