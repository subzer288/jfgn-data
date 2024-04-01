package com.jfgn.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "job_activities")
public class JobActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String activity;
    private int id_job;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

}
