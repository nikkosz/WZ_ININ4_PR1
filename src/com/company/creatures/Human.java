package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private Double salary;
    public Double cash = 3500.00;
    public int garageSize =2;
    public ArrayList<Car> Garage;
    public Human(String spieces) {
        super(spieces);
        Garage = new ArrayList<>();
    }



    public Car getCar(int parkingSpace){

        if(Garage.get(parkingSpace)== null){


                System.out.println("Brak auta");
            } else {
                System.out.println(Garage.get(parkingSpace).producer);
                System.out.println(Garage.get(parkingSpace).model);
                System.out.println(Garage.get(parkingSpace).yearOfProduction);
                System.out.println(Garage.get(parkingSpace).color);
                System.out.println(Garage.get(parkingSpace).engineDisplacement);
                System.out.println(Garage.get(parkingSpace).engineType);
                System.out.println(Garage.get(parkingSpace).value);
                //System.out.println(car.producer);
                //System.out.println(car.model);
                //System.out.println(car.yearOfProduction);
                //System.out.println(car.engineDisplacement);
                //System.out.println(car.engineType);
               // System.out.println(car.color);
                //System.out.println(car.value);
            }
            //return this.car;
            return this.Garage.get(parkingSpace);
    }

    public void setCar(Car car, boolean usun){

        if(usun) {
            for (int i = 0; i < garageSize; i++) {
                if (car == Garage.get(i)){
                    Garage.set(i, null);
                }
            }
        }
        else if(Garage.size() <garageSize){
            Garage.add(car);
        }
        else{
            System.out.println("Brak miejsca brachu");
        }


        //    Car car2= new Car(p, m, y) {
    //        @Override
    //        public void refuel() {

    //        }
    //    };
    //    car2.engineDisplacement = eD;
    //    car2.engineType = eT;
    //    car2.color = c;
    //    car2.value = v;
    //    this.car = car2;
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
    public void checkGarageValue(){
        float value = 0;
        for(int i =0; i < garageSize;i++){
            value += Garage.get(i).value;
        }
        System.out.println("wartość aut w garażu: "+ value);
    }

    @Override
    public void feed() {

    }

    @Override
    public void feedFoodWEight() {

    }
}

