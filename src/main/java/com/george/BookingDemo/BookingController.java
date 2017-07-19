package com.george.BookingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by George on 7/16/2017.
 */
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    BookingRespository bookingRespository;

    @Autowired
    public BookingController(BookingRespository bookingRespository){
        this.bookingRespository = bookingRespository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return  bookingRespository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
    return bookingRespository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value ="/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        bookingRespository.save(hotelBooking);
        return bookingRespository.findAll();
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<HotelBooking> remove(@PathVariable long id){
    bookingRespository.delete(id);
    return  bookingRespository.findAll();
    }
}
