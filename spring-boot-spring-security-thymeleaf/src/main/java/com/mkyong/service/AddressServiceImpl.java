package com.mkyong.service;


import com.mkyong.entity.Address;
import com.mkyong.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
       return (List<Address>) addressRepository.findAll();
    }
}
