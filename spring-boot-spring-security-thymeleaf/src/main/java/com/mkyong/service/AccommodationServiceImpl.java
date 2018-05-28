package com.mkyong.service;

import com.mkyong.entity.Accommodation;
import com.mkyong.repos.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationServiceImpl implements AccommodationService {

    @Autowired
    AccommodationRepository accommodationRepository;

    @Override
    public List<Accommodation> getAll() {
        return (List<Accommodation>) accommodationRepository.findAll();
    }



}
