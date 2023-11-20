package com.Spring.firstjobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();

    void createJob(Job job);


    Job getJobById(Long id);

    boolean deleleJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
