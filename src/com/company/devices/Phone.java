package com.company.devices;

import com.company.creatures.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
    public static final void defaultAPP(){
        String name = "Sklep";
        double version= 1.0;
        String branch ="stable";
        String server_url = "app//appshop.eu";
        String defaultProtocol = "app";
    }

    public void installAnApp(){
        String name = "YouTube";
        double version =3.11;
        String server_URL = "app//app_add.youtube.pl";
    }
    public void installAnApp1(){
        String name = "Waldek ODBIER!";
        double version =0.11;
        String server_URL = "app//waldekodb.com";
    }
    public void installAnApp2(){
        String name = "uniFi";
        double version =4.5;
        String server_URL = "app//unifi.com/download/mobile";
    }
    public void installAnApp3(){
        String name = "YouTube Vanced";
        double version =3.11;
        String server_URL = "app//vanced.you/mobile";
    }





}
