package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    public Device(String producer,
                  String model,
                  Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();




}
