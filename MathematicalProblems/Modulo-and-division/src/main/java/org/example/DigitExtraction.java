package org.example;


import java.util.Scanner;

public class DigitExtraction {
    public static void main(String[] args) {
        extractDigits(new Scanner(System.in).nextInt());
        System.out.println();
        countDigits(new Scanner(System.in).nextInt());
        System.out.println();
    }
    public static void extractDigits(final int startValue){
        int remainder = Math.abs(startValue);
        while(remainder > 0){
            final int value = remainder % 10;
            System.out.print(value + " ");
            remainder /= 10;
        }
        System.out.println();
    }
    public static int countDigits(final int number){
        int count = 0;
        int remainder = Math.abs(number);
        while(remainder > 0){
            remainder /= 10;
            count++;
        }
        System.out.println(count);
        return count;
    }
}