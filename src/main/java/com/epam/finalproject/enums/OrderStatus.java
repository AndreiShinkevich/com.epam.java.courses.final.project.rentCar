package com.epam.finalproject.enums;


public enum OrderStatus {

    IN_PROCESSING("IN_PROCESSING"),
    APPROVED("APPROVED"),
    DECLINED("DECLINED"),
    COMPLETED("COMPLETED");


    private final String name;

    OrderStatus(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
