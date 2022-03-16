package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(){

    }


    public void setFeline(Feline feline) {
        this.feline = feline;
    }

    protected Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }


    //  Feline feline = new Feline
    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
