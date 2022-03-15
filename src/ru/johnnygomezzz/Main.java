package ru.johnnygomezzz;

import java.util.Scanner;

public class Main {
    public static int tarifCost;
    public static int tarifGb;
    public static int oneGbCost;
    public static int gbSum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        tarifCost = scanner.nextInt();
        tarifGb = scanner.nextInt();
        oneGbCost = scanner.nextInt();
        gbSum = scanner.nextInt();

        if (checked()) {
            if (gbSum > tarifGb) {
                System.out.println(tarifCost + (gbSum - tarifGb) * oneGbCost);
            } else {
                System.out.println(tarifCost);
            }
        }
    }

    public static boolean checked() {
        if (tarifCost >= 1 && tarifGb > 0 && oneGbCost > 0 && gbSum <= 100) {
            return true;
        }
        System.out.println("неверное значение");
        return false;
    }
}
