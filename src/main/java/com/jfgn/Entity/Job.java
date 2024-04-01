package com.jfgn.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String company;
    private String city;
    private Date startDate;
    private boolean currentJob;
    private Date endDate;

    @OneToMany(mappedBy = "id_job")
    private List<JobActivity> jobActivities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(boolean currentJob) {
        this.currentJob = currentJob;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<JobActivity> getJobActivities() {
        return jobActivities;
    }

    public void setJobActivities(List<JobActivity> jobActivities) {
        this.jobActivities = jobActivities;
    }
}
