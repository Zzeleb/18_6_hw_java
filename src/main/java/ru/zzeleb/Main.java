package ru.zzeleb;

public class Main {
    public static void main(String[] args) {

        /// математические операторы + переполнение
        int result = 7 - 2;
        System.out.println("### 1.substraction: " + result);

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

        // логические

        if (result2 > result && result4 < result3) {
            System.out.println("### 7.correct");
        }
        if (result2 < result || result4 < result3) {
            System.out.println("### 8.also correct");
        }
        if (!(result2 < result && result4 > result3)) {
            System.out.println("### 9.correct vice versa");
        }
    }
}
