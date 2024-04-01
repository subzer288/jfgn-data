package com.jfgn.Service;

import com.jfgn.Entity.Course;
import com.jfgn.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(){
        return (List<Course>) courseRepository.findAll();
    }
}
