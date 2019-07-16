package com.homework;

public class Main {

    public static void main(String[] args) {
        TimeSpan testTime = new TimeSpan(2, 30);
        TimeSpan testTime2 = new TimeSpan(3, 30);
        TimeSpan testTime3 = new TimeSpan(0, 0);
        TimeSpan testTime4 = new TimeSpan(1, 30);
        testTime.substract(40);
        testTime.multiplicate(1.89);
        testTime2.add(1, 20);
        System.out.println(testTime2);
        testTime3.add(testTime2);
        testTime3.add(40);
        testTime3.add(50.03);
        testTime3.add(12);
        testTime3.add(5.25);
        testTime3.add(2, 15);
        testTime4.add(testTime);
        testTime2.substract(testTime4);
    }
}
