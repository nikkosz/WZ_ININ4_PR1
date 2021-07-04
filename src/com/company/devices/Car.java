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
        Integer indexHBuyer = null;
        Integer indexHSeller = null;

        for (int i = 0; i < seller.Garage.size(); i++) {
            if (seller.Garage.get(i) != null) {
                if (seller.Garage.get(i).hashCode() == this.hashCode()) {
                    indexHSeller = i;
                    break;
                }
            }
        }

        int j = 0;
        while (buyer.Garage.size()> j) {
            if (buyer.Garage.get(j) == null) {
                indexHBuyer = j;
                break;
            }
            j++;
        }
        if (indexHSeller == null) {
            System.out.println("Brak samochodu na sprzedaż!");
        } else if (indexHBuyer == null) {
            System.out.println("Brak miejsca na kupno");
        } else if (buyer.cash < price) {
            System.out.println("No i nie stać na kupno");
        } else {

            System.out.println(buyer.firstName + " kupił " + this.producer + " " + this.model + " from " + seller.firstName + " for " + price);
            boolean u = false;
            buyer.setCar(seller.getCar(indexHSeller), u);
            boolean usun = true;
            seller.setCar(buyer.getCar(indexHBuyer),usun);
            buyer.cash -= price;
            seller.cash += price;
        }
    }
    public abstract void refuel();


}
