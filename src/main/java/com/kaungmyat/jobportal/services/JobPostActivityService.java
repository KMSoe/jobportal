package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.JobPostActivity;
import com.kaungmyat.jobportal.entity.RecruiterJobsDto;

import java.util.List;

public interface JobPostActivityService {
    public JobPostActivity addNew(JobPostActivity jobPostActivity);
    public List<RecruiterJobsDto> getRecruiterJobs(int recruiter);
    public JobPostActivity getOne(int id);
}
