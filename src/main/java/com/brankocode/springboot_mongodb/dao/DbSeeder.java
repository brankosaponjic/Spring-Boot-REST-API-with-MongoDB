package com.brankocode.springboot_mongodb.dao;

import com.brankocode.springboot_mongodb.model.Address;
import com.brankocode.springboot_mongodb.model.Hotel;
import com.brankocode.springboot_mongodb.model.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    public HotelRepository hotelRepository;

    //@Autowired
    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France"),
                Arrays.asList(
                        new Review("John", 8, false),
                        new Review("Mary", 7, true),
                        new Review("Ivan", 8, true)
                )
        );

        Hotel ibis = new Hotel(
                "Ibis",
                90,
                new Address("Bucharest", "Romania"),
                Arrays.asList(
                        new Review("Teddy", 9, true),
                        new Review("Andy", 5, false),
                        new Review("Lacatus", 6, true)
                )
        );

        Hotel sofitel = new Hotel(
                "Sofitel",
                200,
                new Address("Roma", "Italy"),
                Arrays.asList(
                        new Review("Henry", 9, false),
                        new Review("Ricardo", 4, true),
                        new Review("Antonio", 7, true)
                )
        );

        List<Hotel> hotels = Arrays.asList(marriot, ibis, sofitel);

        // drop all hotels
        this.hotelRepository.deleteAll();

        // add hotels to the data base
        this.hotelRepository.saveAll(hotels);

    }

}
