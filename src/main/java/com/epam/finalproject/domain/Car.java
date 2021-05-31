package com.epam.finalproject.domain;

import com.epam.finalproject.enums.CarsTransmission;

public class Car {
    protected Integer idCar;
    private String brand;
    private String model;
    private CarsTransmission carsTransmission;

    public Car() {
    }

    public Car(Integer idCar, String brand, String model, CarsTransmission carsTransmission) {
        this.idCar = idCar;
        this.brand = brand;
        this.model = model;
        this.carsTransmission = carsTransmission;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarsTransmission getCarsTransmission() {
        return carsTransmission;
    }

    public void setCarsTransmission(CarsTransmission carsTransmission) {
        this.carsTransmission = carsTransmission;
    }

}