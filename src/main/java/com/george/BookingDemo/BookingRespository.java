package com.george.BookingDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRespository  extends JpaRepository<HotelBooking, Long>{
    List<HotelBooking> findByPricePerNightLessThan(double price);
}
