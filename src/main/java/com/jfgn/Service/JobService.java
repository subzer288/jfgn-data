package com.jfgn.Service;

import com.jfgn.Entity.Job;
import com.jfgn.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> getJobs(){
        return (List<Job>) jobRepository.findAll();
    }

}
