package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.creatures.Human;

public class Main {

    public static void main(String[] args) {
        String spacer = "---------------------------------------";
        Animal dog = new Animal("canis familiaris");
        dog.name = "Szarik";
//        dog.weight = 12.0;
//        dog.spieces = "canis familiaris";
        System.out.println(spacer);
        Car audi = new Car("Audi", "A6", 2004);
        audi.engineDisplacement = 2.5;
        audi.engineType = "TDI";
        audi.color = "Metalic Grey/Silver";
        audi.value = 12000.00;

        System.out.println(spacer);
        System.out.println(dog.name + " " + dog.spieces);

       dog.printName();
       dog.printNameAndOwner("Waldek");

        String text = dog.getNameAndOwner("Waldek");
           System.out.println(text);

        System.out.println(spacer);

        Human waldek = new Human("HomoSapiens");
        waldek.pet = dog;
        waldek.firstName = "Waldek";
        waldek.lastName = "Kiepski";


        waldek.setSalary(2850.10);
        System.out.println(waldek.pet.spieces);

        System.out.println(spacer);

        Boolean b = true;
        Double d = 2.3;
        Integer i = -32;

        dog.feed(15.0);
        dog.takeForAWalk(300.0);
        System.out.println(spacer);

        System.out.println("wypłata teraz: " + waldek.getSalary());
        waldek.giveRaise(-100.0);

        System.out.println(spacer);

        System.out.println("Auto Waldka to: ");
        System.out.println(waldek.getCar());

        System.out.println(spacer);

        System.out.println(waldek instanceof Animal);
        System.out.println(waldek instanceof Human);
        System.out.println(waldek instanceof Object);


        System.out.println(spacer);
        System.out.println("Samochód waldka po secie to:");
        if (waldek.getSalary() >= audi.value) {
            System.out.println("waldka stać na gotówke to i na ten samochód");
            waldek.setCar("AUDI", "A6", 2004, 2.5, "TDI", "Metalic Grey/Silver", 12000.00);
            System.out.println(waldek.getCar());
        } else if (waldek.getSalary()>= 0.12* audi.value ){
            System.out.println("Udało się z kredytem ale cóz");
            waldek.setCar("AUDI", "A6", 2004,2.5, "TDI", "Metalic Grey/Silver", 12000.00);
            System.out.println(waldek.getCar());
        }else
        {
            System.out.println("GET A BETTER JOB, RAISE, OR EDUCATION. PLEB ");
            System.out.println(waldek.getCar());
        }



    }
}
