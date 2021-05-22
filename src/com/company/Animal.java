package com.company;

import java.sql.SQLOutput;

public class Animal {
    final public String spieces;
    private Double weight;
    String name;

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

    void printName() {
        System.out.println("My name is: " + this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    Double getWeight() {
        return this.weight;
    }


    String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }

    void feed(Double food) {
        if(this.weight>0) {

            Double gain = food / 7.8;
            this.weight += gain;
            System.out.println("Nakarmiony, tyle przybrał: " + gain);
        }else{
            System.out.println("CO TY CHCESZ KARMIC???");
        }


    }

    void takeForAWalk(Double time) {
        Double weightLoos = time / 100;
        this.weight -= weightLoos;
        if (this.weight == 0) {
            System.out.println("No i zdechł");
        } else {
            System.out.println("Stracił: " + weightLoos);
        }
    }
}
