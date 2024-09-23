package org.example;

public class PrintScreen{
    public static void start(){
        System.out.println("Добро Пожаловать в Блэкджек!");
    }
    public static void printRound(int n){
        System.out.println("Раунд " + n);
    }
    public static void dialerGiveCards(){
        System.out.println("Дилер раздал карты");
    }

    public static void showCards(int []arrayOwnCards,int []arrayDialerCards, int []playerSum,int []dialerSum){
        System.out.print(" Ваши карты:[");
        int i = 0;
        while(arrayOwnCards[i++]!=0){
            System.out.print(WorkWithArray.takeFullNameCard(arrayOwnCards[i]) + " (" +
                    WorkWithArray.valueCard(arrayOwnCards[i],playerSum)+ ") ");
        }
        System.out.println("] > " + playerSum[0]);
        i = 0;
        System.out.println(" Карты дилера: [");
        while(arrayDialerCards[i++]!=0){
            System.out.print(WorkWithArray.takeFullNameCard(arrayDialerCards[i]) + " (" +
                    WorkWithArray.valueCard(arrayDialerCards[i],dialerSum)+ ") ");
        }
        if (i == 1)System.out.print(",<закрытая карта>]");
        else System.out.print("] > " + dialerSum[0]);
    }
    public static void distribution(int []array){
        int []playerSum = {0};
        int []dialerSum = {0};
        int indexCard_1 = WorkWithArray.getRandom(array);
        int indexCard_2 = WorkWithArray.getRandom(array);
        int indexCard_3 = WorkWithArray.getRandom(array);
        System.out.println("Ваш ход");
        System.out.println("-------");
        System.out.println("Введите “1”, чтобы взять карту, и “0”, чтобы остановиться...");
    }
}