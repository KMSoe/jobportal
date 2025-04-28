package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.RecruiterProfile;
import com.kaungmyat.jobportal.repository.RecruiterProfileRepository;
import com.kaungmyat.jobportal.services.RecruiterProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecruiterProfileServiceImpl implements RecruiterProfileService {
    private final RecruiterProfileRepository recruiterRepository;

    @Autowired
    public RecruiterProfileServiceImpl(RecruiterProfileRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    @Override
    public Optional<RecruiterProfile> getOne(Integer id) {
        return recruiterRepository.findById(id);
    }

    @Override
    public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
        return recruiterRepository.save(recruiterProfile);
    }
}
