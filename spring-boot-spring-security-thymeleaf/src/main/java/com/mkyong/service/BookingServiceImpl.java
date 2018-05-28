package com.mkyong.service;

import com.mkyong.entity.Booking;
import com.mkyong.repos.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Booking> findAll() {
        return (List<Booking>) bookingRepository.findAll();
    }
}
