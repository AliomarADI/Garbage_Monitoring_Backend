package com.example.garbage.service;

import com.example.garbage.model.User;

public interface IUserService {
    User create(User user);
    void delete(int id);
    User getById(int id);
}
