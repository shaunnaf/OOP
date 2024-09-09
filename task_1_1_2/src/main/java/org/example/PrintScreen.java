package org.example;

public class PrintScreen{
    public void start(){
        System.out.println("Добро Пожаловать в Блэкджек!");
    }
    public void printRound(int n){
        System.out.println("Раунд " + n);
    }
    public void distribution(int []array){
        System.out.println("Дилер раздал карты");
        int indexCard_1 = WorkWithArray.getRandom(array);
        int Card_1 = array[indexCard_1];
        WorkWithArray.zeroing(array,indexCard_1);

        System.out.println(" Ваши карты:["+);
    }
}