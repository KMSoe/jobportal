package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.JobPostActivity;
import com.kaungmyat.jobportal.entity.JobSeekerProfile;
import com.kaungmyat.jobportal.entity.JobSeekerSave;

import java.util.List;

public interface JobSeekerSaveService {
    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId);
    public List<JobSeekerSave> getJobCandidates(JobPostActivity job);
    public void addNew(JobSeekerSave jobSeekerSave);
}
