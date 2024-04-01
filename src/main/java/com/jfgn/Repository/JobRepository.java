package com.jfgn.Repository;

import com.jfgn.Entity.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer> {
}
