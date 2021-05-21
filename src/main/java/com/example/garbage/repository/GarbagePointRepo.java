package com.example.garbage.repository;

import com.example.garbage.model.GarbagePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GarbagePointRepo extends JpaRepository<GarbagePoint,Integer> {
    GarbagePoint getById(int id);

    @Override
    List<GarbagePoint> findAll();

    List<GarbagePoint> getAllByUserId(int id);
}
