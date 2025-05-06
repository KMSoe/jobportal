package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.JobPostActivity;
import com.kaungmyat.jobportal.entity.JobSeekerApply;
import com.kaungmyat.jobportal.entity.JobSeekerProfile;
import com.kaungmyat.jobportal.repository.JobSeekerApplyRepository;
import com.kaungmyat.jobportal.services.JobSeekerApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerApplyServiceImpl implements JobSeekerApplyService {
    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    @Autowired
    public JobSeekerApplyServiceImpl(JobSeekerApplyRepository jobSeekerApplyRepository) {
        this.jobSeekerApplyRepository = jobSeekerApplyRepository;
    }

    @Override
    public List<JobSeekerApply> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerApplyRepository.findByUserId(userAccountId);
    }

    @Override
    public List<JobSeekerApply> getJobCandidates(JobPostActivity job) {
        return jobSeekerApplyRepository.findByJob(job);
    }

    @Override
    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerApplyRepository.save(jobSeekerApply);
    }
}
