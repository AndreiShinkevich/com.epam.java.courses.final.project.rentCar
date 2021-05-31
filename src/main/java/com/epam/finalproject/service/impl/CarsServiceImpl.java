package com.epam.finalproject.service.impl;

import com.epam.finalproject.domain.Car;
import com.epam.finalproject.repository.CarsRepository;
import com.epam.finalproject.service.CarsService;

import java.util.List;

public class CarsServiceImpl implements CarsService {

    private CarsRepository carsRepository;

    public CarsServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carsRepository.getAll();
    }


}

