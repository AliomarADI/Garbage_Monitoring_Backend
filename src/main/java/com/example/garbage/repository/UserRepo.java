package com.example.garbage.repository;

import com.example.garbage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User getById(int id);
    User getByPhoneNumber(String phoneNumber);
}
