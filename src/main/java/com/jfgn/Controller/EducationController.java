package com.jfgn.Controller;

import com.jfgn.Entity.Education;
import com.jfgn.Service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/education")
public class EducationController {

    @Autowired
    EducationService educationService;

    @GetMapping()
    public List<Education> get(){
        return educationService.getSchools();
    }
}
