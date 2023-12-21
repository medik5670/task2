package com.company;

public class Main {

    public static void main(String[] args) {
	int nachamount = 100;
    int controlnyasumma = 1000;
    int popolneniecheta;
    int bonus;
    int itog;

    popolneniecheta = 1200;

    if(popolneniecheta > controlnyasumma) {
        bonus = popolneniecheta / 100;
    }else{
        bonus = 0;
    }
    itog = nachamount + bonus + popolneniecheta;
        System.out.println("Баланс" + itog);
        System.out.println("Количество бонусных рублей" + bonus);
    }
}
