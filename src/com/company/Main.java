package com.company;

import java.net.SocketTimeoutException;

public class Main {

    public static void main(String[] args) {
        String spacer = "---------------------------------------";
        Animal dog = new Animal("canis familiaris");
        dog.name = "Szarik";
//        dog.weight = 12.0;
//        dog.spieces = "canis familiaris";
        System.out.println(spacer);
        Car audi = new Car("Audi","A6");
        audi.engineDisplacement=2.5;
        audi.engineType="TDI";
        audi.color="Metalic Grey/Silver";


        System.out.println(spacer);
        System.out.println(dog.name + " " + dog.spieces);

        dog.printName();
        dog.printNameAndOwner("Waldek");

        String text = dog.getNameAndOwner("Waldek");
        System.out.println(text);

        System.out.println(spacer);

        Human waldek = new Human();
        waldek.pet = dog;
        waldek.firstName = "Waldek";
        waldek.lastName = "Kiepski";
        waldek.car = audi;


        waldek.setSalary(2850.10);
        System.out.println(waldek.pet.spieces);

        System.out.println(spacer);

        Boolean b = true;
        Double d = 2.3;
        Integer i = -32;

        dog.feed(15.0);
        dog.takeForAWalk(300.0);
        System.out.println(spacer);

        System.out.println("wypłata teraz: "+waldek.getSalary());
        waldek.giveRaise(-100.0);

        System.out.println(spacer);

        System.out.println("Auto Waldka to: ");
        System.out.println(waldek.car.producer);
        System.out.println(waldek.car.model);
        System.out.println(waldek.car.engineDisplacement+" "+waldek.car.engineType);
        System.out.println(waldek.car.color);

        System.out.println(spacer);


    }
}
