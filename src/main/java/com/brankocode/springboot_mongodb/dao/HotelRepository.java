package com.brankocode.springboot_mongodb.dao;

import com.brankocode.springboot_mongodb.model.Hotel;
import com.mongodb.Mongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {
//    int insertNewHotel(Hotel hotel);
//    Hotel selectHotelById(String id);
//    List<Hotel> selectAllHotels();
//    int updateHotelById(String id, Hotel newHotel);
//    int deleteHotelById(String id);
}
