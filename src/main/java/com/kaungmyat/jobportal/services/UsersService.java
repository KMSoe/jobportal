package com.kaungmyat.jobportal.services;

import com.kaungmyat.jobportal.entity.Users;

import java.util.Optional;

public interface UsersService {
    public Users addNew(Users users);
    public Object getCurrentUserProfile();
    public Users getCurrentUser();
    public Users findByEmail(String currentUsername);
    public Optional<Users> getUserByEmail(String email);
 }
