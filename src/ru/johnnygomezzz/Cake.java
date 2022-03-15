package ru.johnnygomezzz;

import java.util.Scanner;

public class Cake {
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        System.out.println(totalResult());
    }

    public static int resultFor(int sum) {
        int cutCount = 0;

        while (sum >= 2) {

            if (sum % 2 == 1) {
                cutCount++;
            }
            sum = sum / 2;

            cutCount++;
        }
        return cutCount;
    }

    public static int totalResult() {

        if (n <= 1) {
            return 0;
        }
        return resultFor(n);
    }
}
