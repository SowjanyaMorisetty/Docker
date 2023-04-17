package com.UST.InterviewScheduler.repository;

import com.UST.InterviewScheduler.model.InterviewDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends JpaRepository<InterviewDetails,Integer> {

}
