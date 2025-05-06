package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.JobPostActivity;
import com.kaungmyat.jobportal.entity.JobSeekerProfile;
import com.kaungmyat.jobportal.entity.JobSeekerSave;
import com.kaungmyat.jobportal.repository.JobSeekerSaveRepository;
import com.kaungmyat.jobportal.services.JobSeekerSaveService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveServiceImpl implements JobSeekerSaveService {
    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveServiceImpl(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    @Override
    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    @Override
    public List<JobSeekerSave> getJobCandidates(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }

    @Override
    @Transactional
    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
