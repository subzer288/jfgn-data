package com.jfgn.Controller;

import com.jfgn.Entity.Job;
import com.jfgn.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping()
    public List<Job> get(){
        return jobService.getJobs();
    }
}
