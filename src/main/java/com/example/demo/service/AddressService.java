package com.example.demo.service;

import com.example.demo.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressService extends CrudRepository<Address,Integer> {
}
