package com.example.garbage.service.serviceImpl;

import com.example.garbage.model.User;
import com.example.garbage.repository.UserRepo;
import com.example.garbage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.delete(userRepo.getById(id));
    }

    @Override
    public User getById(int id) {
        return userRepo.getById(id);
    }
}
