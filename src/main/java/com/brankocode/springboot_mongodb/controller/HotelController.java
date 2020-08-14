package com.brankocode.springboot_mongodb.controller;

import com.brankocode.springboot_mongodb.dao.HotelRepository;
import com.brankocode.springboot_mongodb.model.Hotel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();

        return hotels;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel) {
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        this.hotelRepository.save(hotel);
    }

//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable("id") String id) {
//        this.hotelRepository.delete(();
//    }

}
