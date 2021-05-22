package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;



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

