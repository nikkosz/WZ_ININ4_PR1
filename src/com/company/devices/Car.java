package com.company.devices;

public class Car {

    public final String producer;
    public final String model;
    public Double engineDisplacement; //in liters ex 2.5
    public String engineType; //type of an engine ex To Dopiero Idzie
    public String color;
    public Double value;

    public Car(String producer, String model){
        this.producer = producer;
        this.model = model;
    }


}
