package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 06.12.2018.
 */
public class PascalTriangle1 {

    public static void print(int row) {
        for (int n = 0; n < row; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(nCk(n, k) + " ");
            }
            System.out.println();
        }
    }

    public static int nCk(int n, int k) {
        int numerator = fact(n);
        int denominator = fact(k) * fact(n - k);
        int result = (int) (numerator / denominator);
        return result;
    }

    public static int fact(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz numer wiersza, dla którego ma zostać wyświetlony trójkąt Pascala: ");
        int row = scanner.nextInt();
        print(row);
    }
}
