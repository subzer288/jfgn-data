package com.jfgn.Service;

import com.jfgn.Entity.Education;
import com.jfgn.Repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationService {
    @Autowired
    EducationRepository educationRepository;

    public List<Education> getSchools(){
        return (List<Education>) educationRepository.findAll();
    }
}
