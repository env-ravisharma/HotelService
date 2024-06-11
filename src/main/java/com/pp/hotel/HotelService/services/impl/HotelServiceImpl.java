package com.pp.hotel.HotelService.services.impl;

import com.pp.hotel.HotelService.entities.Hotel;
import com.pp.hotel.HotelService.exeptions.ResourceNotFoundException;
import com.pp.hotel.HotelService.repositories.HotelRepository;
import com.pp.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        Optional<Hotel> byId = hotelRepository.findById(id);
        return byId.orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !! : "+ id));
    }
}
