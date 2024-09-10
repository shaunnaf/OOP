package org.example;

import java.util.Random;

public class WorkWithArray {
    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        while (array[rnd%52]==0) {
            rnd++;
        }
        return rnd;
    }

    public static void zeroing(int[] array,int rnd){
        array[rnd] = 0;
    }

    public static String takeFullNameCard(int[]array,int rnd){
        String name = "";
        if(array[rnd]%13<=10){
            name = takeStringValueCard(name,array,rnd);
            name+=" ";
            name += takeSuitNumberCard(name,array,rnd);
        }
        else{
            name =
        }
    }

    public static String takeStringValueCard(String name,int[]array,int index){
        switch (array[index]%13){
            case 1:
                name+="Туз";
                break;
            case 2:
                name+="Двойка";
                break;
            case 3:
                name+="Тройка";
                break;
            case 4:
                name +="Четверка";
                break;
            case 5:
                name +="Пятерка";
                break;
            case 6:
                name += "Шестерка";
                break;
            case 7:
                name += "Семерка";
                break;
            case 8:
                name += "Восьмерка";
                break;
            case 9:
                name += "Девятка";
                break;
            case 10:
                name+= "Десятка";
                break;
            case 11:
                name +="Валет";
                break;
            case 12:
                name+="Дама";
                break;
            case 0:
                name+="Король";
                break;
        }
        return name;
    }

    public static String takeSuitNumberCard(String name,int[]array,int index){
        switch (array[index/13]){
            case 0:
                name+="Пики";
                break;
            case 1:
                name+="Трефы";
                break;
            case 2:
                name += "Червы";
                break;
            case 3:
                name += "Буби";
                break;
        }
        return name;
    }
}

public static int takeNumberCard(int[]array,int index){
    return
}
