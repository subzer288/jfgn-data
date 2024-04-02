package com.jfgn.Controller;

import com.jfgn.Entity.Technology;
import com.jfgn.Service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

    @Autowired
    TechnologyService technologyService;

    @GetMapping()
    public List<Technology> get(){
        return technologyService.getTechnologies();
    }
}
