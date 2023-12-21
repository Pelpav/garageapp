package com.spring.garageapp.repository;

import com.spring.garageapp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {

}
