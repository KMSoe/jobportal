package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.JobSeekerProfile;

import java.util.Optional;

public interface JobSeekerProfileService {
    public Optional<JobSeekerProfile> getOne(Integer id);
    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile);
}
