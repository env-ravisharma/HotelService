package com.pp.hotel.HotelService.entities;


import jakarta.persistence.Table;

@Table(name="hotels")
public class Hotel {

    private String id;
    private String name;
    private String localtion;
    private String about;

}
