package com.example.garbage.controller;

import com.example.garbage.model.GarbagePoint;
import com.example.garbage.service.IGarbagePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    IGarbagePointService garbagePointService;

    @GetMapping("/garbages/{userId}")
    public List<GarbagePoint> getGarbagesByUserId(@PathVariable int userId){
        return garbagePointService.getAllByUserId(userId);
    }

    @PostMapping("/createGarbagePoint")
    public GarbagePoint createGarbagePoint(@RequestBody GarbagePoint garbagePoint){
        return garbagePointService.createGarbagePoint(garbagePoint);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGarbagePointById(@PathVariable int id){
        garbagePointService.deleteGarbagePoint(id);
    }

}
