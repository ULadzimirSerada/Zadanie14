package com.company;

import java.util.Arrays;
import java.util.Random;

/*Задание 14
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.*/
public class Zadanie14 {
    public static void main(String[] args) {

        int array [] ={1,5,6,8,7,9,55,65,21,85,76};
        int minNumber = array[0];
        int minIndex = 0;
        int maxNumber = array[0];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < minNumber) {
                minNumber = array[i];
                minIndex = i;
            }
            if (array[i] > maxNumber){
                maxNumber = array[i];
                maxIndex = i;
            }

        }
        System.out.println("минимальная оценка " + minNumber + "- номер в цикле " + minIndex);
        System.out.println("максимальная оценка " +maxNumber + "- номер в цикле " + maxIndex);


        }
    }












