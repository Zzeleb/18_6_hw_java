package ru.zzeleb;

public class Main {
    public static void main(String[] args) {

        /// 1.1 математические операторы + переполнение
        int result = 7 - 2;
        System.out.println("### 1.subtraction: " + result);

        int result2 = 7 + 2;
        System.out.println("### 2.addition: " + result2);

        int result3 = 7 * 2;
        System.out.println("### 3.multiplication: " + result3);

        int result4 = 7 / 2;
        System.out.println("### 4.division: " + result4);

        int result5 = 7 % 2;
        System.out.println("### 5.remainder: " + result5);

        int result6 = 300000 * 200000;
        System.out.println("### 6.overflow:" + result6);

        // 1.2 логические

        if (result2 > result && result4 < result3) {
            System.out.println("### 7.correct");
        }
        if (result2 < result || result4 < result3) {
            System.out.println("### 8.also correct");
        }
        if (!(result2 < result && result4 > result3)) {
            System.out.println("### 9.correct vice versa");

        // 2 вычисления комбинаций типов данных (int и double)
        int a = 500;
        double b = 2.2;
        double result7 = a * b;
            System.out.println("### 10.combination:" + result7);
            // или
            System.out.println("### 10.2 combination:" + a * b);

        double result8 = a / b;
                   System.out.println("### 11.int/double division:" +result8);


        }
    }
}
