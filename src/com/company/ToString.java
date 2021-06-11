package com.company;

class StringNew{

    private Integer d;

    public StringNew(int d){
        this.d = d;
    }
    public Integer getD(){
        return d;
    }
}

public class ToString {

    public static void main(String args[]){
        StringNew damnString = new StringNew(20);
        System.out.println("Objekt toString:  "+ damnString);

    }


}
