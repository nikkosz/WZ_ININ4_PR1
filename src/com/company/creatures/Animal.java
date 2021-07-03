package com.company.creatures;

import com.company.Selleable;
import com.ibm.dtfj.corereaders.zos.le.Edb;

import java.sql.SQLOutput;

public class Animal  implements Selleable {
    final public String spieces;
    private Double weight;
    public String name;

    public Animal(String spieces) {
        this.spieces = spieces;

        switch (this.spieces) {
            case "canis familiaris":
                this.weight = 12.5;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            case "quine pig":
                this.weight = 0.5;
                break;
        }
    }

    public void printName() {
        System.out.println("My name is: " + this.name);
    }

    public void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    public Double getWeight() {
        return this.weight;
    }


    public String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }

    public void feed(Double food) {
        if(this.weight>0) {

            Double gain = food / 7.8;
            this.weight += gain;
            System.out.println("Nakarmiony, tyle przybrał: " + gain);
        }else{
            System.out.println("CO TY CHCESZ KARMIC???");
        }


    }

    public void takeForAWalk(Double time) {
        Double weightLoos = time / 100;
        this.weight -= weightLoos;
        if (this.weight == 0) {
            System.out.println("No i zdechł");
        } else {
            System.out.println("Stracił: " + weightLoos);
        }
    }






    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(this instanceof Human){
            System.out.println("No chyba nie sprzedajesz człowieka???");
        }

        else if(seller.pet != this){
            System.out.println("Nie masz zwierzaka chłopcze");
        }
        else if(buyer.cash < price){
            System.out.println("No nie stać Cię kolego");
        }else{
            buyer.pet = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("No i niemiec płakał jak sprzedawał");
        }
    }
}
class FarmAnimal implements Edbile{
    @Override
    public void beEaten() {

    }
}
class Pet {
}

