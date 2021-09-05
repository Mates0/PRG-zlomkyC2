package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");
        double n = sc.nextInt();
        double sum = 0;
        double sum2;
        for (int i = 1; i < n + 1; i++) {
            sum += 1.0 / i;
            sum2 = 1.0 / i;
            System.out.println("1/" + i + " " + "=>" + " " + sum2);
        }
        System.out.println("Celkem =>" + " " + sum);
    }
}
