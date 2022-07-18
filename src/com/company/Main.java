package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers2 = {3,-3,45,9,-7,0,5,2,4,8,-6,6,-2,-8,12};
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] < 0) {
                continue;
            }
            System.out.println(numbers2[i]);
        }
        double numbers[] = {2.2, -0.21, 3.55, 88.1, 31.25};
        double sumOfPosNum = 0.0;
        int numOfNumbers = 0;

        for (double currentNumbers : numbers) {
            if (currentNumbers > 0) {
                sumOfPosNum = sumOfPosNum + currentNumbers;
                numOfNumbers++;
            } else {
                continue;
            }
        }
        for (double currentNumbers2 : numbers) {
            if (currentNumbers2 > 0) {
                sumOfPosNum = sumOfPosNum - currentNumbers2;
                numOfNumbers--;
            } else {
                break;
            }
        }
        System.out.println(sumOfPosNum / numOfNumbers);
    }
}
