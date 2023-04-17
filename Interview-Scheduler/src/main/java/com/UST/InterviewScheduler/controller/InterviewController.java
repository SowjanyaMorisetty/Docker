package com.UST.InterviewScheduler.controller;

import com.UST.InterviewScheduler.model.InterviewDetails;
import com.UST.InterviewScheduler.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interviewdetails")
public class InterviewController {

    @Autowired
    private InterviewService interviewService;

    @PostMapping("/addinterviewee")
    public InterviewDetails addInterviewee(@RequestBody InterviewDetails interviewDetails ) {
        return interviewService.createInterviewDetails(interviewDetails);
    }

    @GetMapping("/getInterviewDetails")
    public List<InterviewDetails> getAllInterviewee(){

        return interviewService.getInterviewDetails();
    }

    @GetMapping("/interviewDetails/{id}")
    public InterviewDetails getInterviewDetailsById(@PathVariable int id) {
        return interviewService.getInterviewDetailsById(id);
    }






    }
