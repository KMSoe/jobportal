package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.RecruiterProfile;
import com.kaungmyat.jobportal.entity.Users;
import com.kaungmyat.jobportal.repository.RecruiterProfileRepository;
import com.kaungmyat.jobportal.repository.UsersRepository;
import com.kaungmyat.jobportal.services.RecruiterProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecruiterProfileServiceImpl implements RecruiterProfileService {
    private final RecruiterProfileRepository recruiterRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public RecruiterProfileServiceImpl(RecruiterProfileRepository recruiterRepository,
                                       UsersRepository usersRepository) {
        this.recruiterRepository = recruiterRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public Optional<RecruiterProfile> getOne(Integer id) {
        return recruiterRepository.findById(id);
    }

    @Override
    public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
        return recruiterRepository.save(recruiterProfile);
    }

    @Override
    public RecruiterProfile getCurrentRecruiterProfile() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUsername = authentication.getName();
            Users users = usersRepository.findByEmail(currentUsername).orElseThrow(() -> new UsernameNotFoundException("User not found"));
            Optional<RecruiterProfile> recruiterProfile = getOne(users.getUserId());
            return recruiterProfile.orElse(null);
        } else return null;
    }
}
