package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device{


    public Double engineDisplacement; //in liters ex 2.5
    public String engineType; //type of an engine ex To Dopiero Idzie
    public String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public void turnOn(){
        System.out.println("Nooooo odpal żeś w końcu");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
    public abstract void refuel();


}
