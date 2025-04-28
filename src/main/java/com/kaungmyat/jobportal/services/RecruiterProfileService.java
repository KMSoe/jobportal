package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.RecruiterProfile;

import java.util.Optional;

public interface RecruiterProfileService {
    public Optional<RecruiterProfile> getOne(Integer id);
    public RecruiterProfile addNew(RecruiterProfile recruiterProfile);
}
