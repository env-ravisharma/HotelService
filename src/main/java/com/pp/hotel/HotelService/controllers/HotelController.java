package com.pp.hotel.HotelService.controllers;

import com.pp.hotel.HotelService.entities.Hotel;
import com.pp.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel user){
        Hotel user1 = hotelService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
        Hotel user = hotelService.get(hotelId);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllUser(){
        List<Hotel> allUsers = hotelService.getAll();
        return ResponseEntity.ok(allUsers);
    }

}
