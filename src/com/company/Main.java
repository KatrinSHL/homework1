package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
        System.out.println(" Please introduce yourself");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello   " + name);
        System.out.println("Oopss!!");
        // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

        String reversedString = new StringBuffer(name).reverse().toString();
        System.out.println(reversedString);

        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

        int a = 0;
        int b = 3;
        for (int i = 0; i < 4; i++) {
            int number = a + (int) (Math.random() * b);

            System.out.println(number + "  " + number + "\n" + number);

        }

        // 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        System.out.println("enter your password");
        String password = scanner.nextLine();
        String c = "1234";

        System.out.println(password.equals(c));

        // 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println(sum);


    }
}
