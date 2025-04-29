package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.JobSeekerProfile;
import com.kaungmyat.jobportal.repository.JobSeekerProfileRepository;
import com.kaungmyat.jobportal.services.JobSeekerProfileService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {
    private final JobSeekerProfileRepository jobSeekerProfileRepository;

    public JobSeekerProfileServiceImpl(JobSeekerProfileRepository jobSeekerProfileRepository) {
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
    }

    @Override
    public Optional<JobSeekerProfile> getOne(Integer id) {
        return this.jobSeekerProfileRepository.findById(id);
    }

    @Override
    public JobSeekerProfile addNew(JobSeekerProfile jobSeekerProfile) {
        return jobSeekerProfileRepository.save(jobSeekerProfile);
    }
}
