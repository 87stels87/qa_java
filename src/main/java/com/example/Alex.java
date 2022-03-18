package com.example;

import java.util.List;

public class Alex extends Lion {

    private final String SEX = "Самец";

    public String getSex() {
        return SEX;
    }

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глори", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йорк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

}






