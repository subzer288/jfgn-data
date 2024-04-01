package com.jfgn.Service;

import com.jfgn.Entity.Technology;
import com.jfgn.Repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {
    @Autowired
    TechnologyRepository technologyRepository;

    public List<Technology> getTechnologies(){
        return (List<Technology>) technologyRepository.findAll();
    }
}
