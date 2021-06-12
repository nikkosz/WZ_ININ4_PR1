package com.company.devices;

public class Phone extends Device implements Rechargeable{
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
    @Override
    public void recharge(){
        System.out.println("charging");
    }
    @Override
    public void rechargeFull(){
        System.out.println("Fullu charging");
    }
    @Override
    public Double getBatteryLevel(){
        return 0.1;
    }
}
