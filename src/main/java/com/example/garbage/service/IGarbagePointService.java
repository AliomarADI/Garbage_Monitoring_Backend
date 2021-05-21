package com.example.garbage.service;

import com.example.garbage.model.GarbagePoint;

import java.util.List;

public interface IGarbagePointService {
    GarbagePoint createGarbagePoint(GarbagePoint garbagePoint,String phoneNumber);
    void deleteGarbagePoint(int id);
    List<GarbagePoint> getAllByUserId(int id);
}
