package com.company;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        //Ввести с консоли n целых чисел. На консоль вывести:
        //      6.1. Четные и нечетные числа.
        System.out.print("Enter size of array ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        System.out.print("Enter numbers separated by a space ");
        for (int i = 0; i < a; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 != 0)
                System.out.println("Odd number:" + numbers[i]);
            else if (numbers[i] % 2 == 0)
                System.out.println("Even number:" + numbers[i]);
        }
        //    6.2. Наибольшее и наименьшее число.
        int min = numbers[0];
        for (int i = 0; i < a; i++) {
            if (min >= numbers[i]) ;
        }
        System.out.println("Min number:" + min);
        int max = numbers[0];
        for (int i = 0; i < a; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("Max number:" + max);
//  6.3. Числа, которые делятся на 3 или на 9.
        for (int i = 0; i < a; i++)
            if (numbers[i] % 3 == 0)
                System.out.println("Number divisible by 3 " + numbers[i]);
        //6.4. Числа, которые делятся на 5 и на 7.
        for (int i = 0; i < a; i++)
            if ((numbers[i] % 5 == 0) | (numbers[i] % 7 == 0))
                System.out.println("A number that is divisible by 5 and 7 " + numbers[i]);
        // 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
//цифр.
        int s = 0, b = 0, c = 0;
        for (int j = 0; j < a; j++)
            if ((numbers[j] > 99) && (numbers[j] < 1000)) {
                s = numbers[j] / 10 / 10;
                b = numbers[j] / 10 % 10;
                c = numbers[j] % 100 % 10;
                if (s != b && s != c && b != s && b != c && c != s && c != b)

                    System.out.println("3-digit number in decimal notation of which there are no identical digits: " + numbers[j]);
            }
        //6.6. «Счастливые» числа.
        int a1 = 0, b1 = 0;
        for (int j = 0; j < a; j++)
            if ((numbers[j] > 99999) && (numbers[j] < 1000000)) {

                a1 = numbers[j] / 1000;
                b1 = numbers[j] % 1000;

                int sum = 0;
                int sum1 = 0;
                while (a1 != 0) {
                    sum = sum + a1 % 10;
                    a1 = a1 / 10;
                }

                while (b1 != 0) {
                    sum1 = sum1 + b1 % 10;
                    b1 = b1 / 10;
                }

                if (sum == sum1) {
                    System.out.println("Lucky number: " + numbers[j]);
                }
            }
    }

}




