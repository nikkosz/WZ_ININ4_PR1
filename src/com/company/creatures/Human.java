package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary;
    public Double cash = 3500.00;
    public Human(String spieces) {
        super(spieces);
    }

    public Car getCar(){
        if(car==null){
           System.out.println("Brak auta");
        }else {
            System.out.println(car.producer);
            System.out.println(car.model);
            System.out.println(car.yearOfProduction);
            System.out.println(car.engineDisplacement);
            System.out.println(car.engineType);
            System.out.println(car.color);
            System.out.println(car.value);
        }
        return this.car;
    }

    public void setCar(String p, String m, Integer y, Double eD, String eT, String c, Double v){
        Car car2= new Car(p, m, y);
        car2.engineDisplacement = eD;
        car2.engineType = eT;
        car2.color = c;
        car2.value = v;
        this.car = car2;
    }

    public double getSalary(){
        System.out.println(new Date());
        return this.salary;

    }
    public void setSalary(double paycheck){
        if(paycheck <=0.0){
            System.out.println("Jeszcze Ty masz płacić pracodawcy?!?!");
        }else {
            this.salary = paycheck;
        }
    }
    public void giveRaise(double raise){
        if(raise >=0){
            this.salary += raise;
            System.out.println("No no podwyższka :D");
            System.out.println("Zostało to wysłane do księgowości");
            System.out.println("Teraz trzeba by było odebrać aneks do umowy od p.Hani z HR'u");
            System.out.println("PS: ZUS, US i inne bzdety już wiedzą, więc nie ukryjesz dochodu Ty zły i nie dobry");
            System.out.println("Teraz Twój PAYDAY to: "+this.salary);
        }else{
            this.salary += raise;
            System.out.println("No no, coś tym razem zrobił? Znowu Ci obcieli!!");
            System.out.println("Zostało to wysłane do księgowości");
            System.out.println("Teraz trzeba by było odebrać aneks do umowy od p.Hani z HR'u");
            System.out.println("PS: ZUS, US i inne bzdety już wiedzą, więc nie ukryjesz dochodu Ty zły i nie dobry");
            System.out.println("Teraz Twój PAYDAY to: "+this.salary);
        }





    }

}

