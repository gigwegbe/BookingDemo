package com.george.BookingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRespository bookingRespository;

    @Autowired
    public DatabaseSeeder (BookingRespository bookingRespository){
    this.bookingRespository = bookingRespository;
    }

    @Override
    public void run(String... strings) throws Exception {
    {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90, 2));
        bookings.add(new HotelBooking("Novotel", 140.50, 1));

        bookingRespository.save(bookings);
    }

    }
}
