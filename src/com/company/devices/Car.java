package com.company.devices;

public class Car extends Device{


    public Double engineDisplacement; //in liters ex 2.5
    public String engineType; //type of an engine ex To Dopiero Idzie
    public String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String turnOn(){
        return "to dla device";
    }

}
