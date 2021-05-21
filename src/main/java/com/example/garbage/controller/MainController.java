package com.example.garbage.controller;

import com.example.garbage.model.GarbagePoint;
import com.example.garbage.model.User;
import com.example.garbage.service.IGarbagePointService;
import com.example.garbage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    IGarbagePointService garbagePointService;
    IUserService userService;

    @Autowired
    public MainController(IGarbagePointService garbagePointService, IUserService userService) {
        this.garbagePointService = garbagePointService;
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable  int id){
        return userService.getById(id);
    }

    @GetMapping("/garbages/{userId}")
    public List<GarbagePoint> getGarbagesByUserId(@PathVariable int userId){
        return garbagePointService.getAllByUserId(userId);
    }

    @PostMapping("/createGarbagePoint/{phoneNumber}")
    public GarbagePoint createGarbagePoint(@RequestBody GarbagePoint garbagePoint,@PathVariable String phoneNumber ){
        return garbagePointService.createGarbagePoint(garbagePoint,phoneNumber);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGarbagePointById(@PathVariable int id){
        garbagePointService.deleteGarbagePoint(id);
    }

}
