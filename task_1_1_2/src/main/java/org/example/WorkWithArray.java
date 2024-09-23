package org.example;

import java.util.Random;

public class WorkWithArray {
    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        while (array[rnd%52]==0) {
            rnd++;
        }
        array[rnd] = 0;
        return rnd;
    }
    public static void init_array(int[] array){
        for (int i = 0;i<52;i++){
            array[i] = 1;
        }
    }
    public static String takeFullNameCard(int index){
        String name;
        if(index%13<=10){
            name = takeStringValueCard(index);
            name+=" ";
            name += takeSuitNumberCard(index);
        }
        else{
            name = takeSuitPictureCard(index);
            name += " ";
            name += takeStringValueCard(index);
        }
        return name;
    }

    public static String takeSuitPictureCard(int index){
        String name = "";
        switch (index/13){
            case 0:
                if (index % 13 == 12) name = "Пиковая";
                else name = "Пиковый";
                break;
            case 1:
                if (index % 13 == 12) name = "Трефовая";
                else name = "Трефовый";
                break;
            case 2:
                if (index % 13 == 12) name = "Червовая";
                else name = "Червовый";
                break;
            case 3:
                if (index % 13 == 12) name = "Бубновая";
                else name = "Бубновый";
                break;
        }
        return name;
    }

    public static String takeStringValueCard(int index){
        return switch (index % 13) {
            case 1 -> "Туз";
            case 2 -> "Двойка";
            case 3 -> "Тройка";
            case 4 -> "Четверка";
            case 5 -> "Пятерка";
            case 6 -> "Шестерка";
            case 7 -> "Семерка";
            case 8 -> "Восьмерка";
            case 9 -> "Девятка";
            case 10 -> "Десятка";
            case 11 -> "Валет";
            case 12 -> "Дама";
            case 0 -> "Король";
            default -> "";
        };
    }
    public static String takeSuitNumberCard(int index){
        return switch (index / 13) {
            case 0 -> "Пики";
            case 1 -> "Трефы";
            case 2 -> "Червы";
            case 3 -> "Буби";
            default -> "";
        };
    }

    public static int valueCard(int index,int []sum){
        int answer = index%13;
        if (answer>10 || answer == 0) answer = 10;
        else if (answer == 1 && sum[0]+11<=21) answer = 11;
        sum[0] += answer;
        return answer;
    }
}
