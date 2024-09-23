package org.example;

public class Main {
    public static void main(String[] args) {
       int []array = new int[52];
       WorkWithArray.init_array(array);
       PrintScreen.start();
       PrintScreen.printRound(1);
       PrintScreen.dialerGiveCards();
       PrintScreen.distribution(array);
    }
}