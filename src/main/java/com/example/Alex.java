package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {
    // константа для пола Алекса.
    private final String SEX = "Самец";
    //лист друзей - значения внесены через инициализацию массива и затем приведением к списку
    List<String> friends = Arrays.asList("Марти", "Глори", "Мелман");
    //геттер для пола
    public String getSex() {
        return SEX;
    }
    //переопределил метод и сделал 0
    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
    // метод возвращающий место жительства
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
    // метод возвращающий список друзей
    public List<String> getFriends() {
        return friends;
    }


}


