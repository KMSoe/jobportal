package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.JobPostActivity;
import com.kaungmyat.jobportal.entity.JobSeekerApply;
import com.kaungmyat.jobportal.entity.JobSeekerProfile;

import java.util.List;

public interface JobSeekerApplyService {
    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId);
    public List<JobSeekerApply> getJobCandidates(JobPostActivity job);
    public void addNew(JobSeekerApply jobSeekerApply);
}
