package com.company.devices;

import com.company.Selleable;
import com.company.creatures.Human;

public abstract class Device implements Selleable {
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
