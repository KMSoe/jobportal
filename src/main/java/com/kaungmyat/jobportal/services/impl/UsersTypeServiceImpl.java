package com.kaungmyat.jobportal.services.impl;

import com.kaungmyat.jobportal.entity.UsersType;
import com.kaungmyat.jobportal.repository.UsersTypeRepository;
import com.kaungmyat.jobportal.services.UsersTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeServiceImpl implements UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeServiceImpl(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    @Override
    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
}
