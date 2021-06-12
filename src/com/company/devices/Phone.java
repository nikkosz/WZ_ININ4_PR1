package com.company.devices;

public class Phone extends Device{
    String producent;
    String model;
    Double screenSize;
    String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn(){

        System.out.println("Po godzinahcn mizernego ładowania - odpalił");
    }
}
