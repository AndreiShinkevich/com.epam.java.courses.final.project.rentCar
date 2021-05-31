package com.epam.finalproject.repository;

import com.epam.finalproject.domain.Car;
import com.epam.finalproject.enums.CarsTransmission;

import java.util.List;

public class CarsRepository {


    public List<Car> getAll() {
        return List.of(
                new Car(1, "vw", "sharan", CarsTransmission.MECHANIC),
                new Car(2, "reno", "modus", CarsTransmission.AUTOMATIC));

    }
}
