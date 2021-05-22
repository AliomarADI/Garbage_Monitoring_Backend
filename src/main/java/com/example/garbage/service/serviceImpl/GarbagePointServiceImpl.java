package com.example.garbage.service.serviceImpl;

import com.example.garbage.model.GarbagePoint;
import com.example.garbage.repository.GarbagePointRepo;
import com.example.garbage.service.IGarbagePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarbagePointServiceImpl implements IGarbagePointService {

    @Autowired
    GarbagePointRepo garbagePointRepo;

    @Override
    public GarbagePoint createGarbagePoint(GarbagePoint garbagePoint) {
        return garbagePointRepo.save(garbagePoint);
    }

    @Override
    public void deleteGarbagePoint(int id) {
        garbagePointRepo.delete(garbagePointRepo.getById(id));
    }

    @Override
    public List<GarbagePoint> getAllByUserId(String id) {
        return garbagePointRepo.getAllByUserPhoneNumber(id);
    }
}
