package com.jfgn.Repository;

import com.jfgn.Entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
