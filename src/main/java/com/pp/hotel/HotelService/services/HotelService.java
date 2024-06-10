package com.pp.hotel.HotelService.services;

import com.pp.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);

}
