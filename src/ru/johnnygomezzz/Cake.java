package ru.johnnygomezzz;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Cake {
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        totalResult();
    }

    public static int resultFor(int sum) {
        int cutCount = 0;

        while (sum >= 2) {
            sum = sum / 2;
            cutCount++;
        }
        return cutCount;
    }

    public static void totalResult() {

        if (n <= 1) {
            System.out.println(0);
        }
        if (n == 2) {
            System.out.println(1);
        }
        if (n > 2 && n % 2 == 0) {
            System.out.println(1 + resultFor(n));
        }
        if (n > 2 && n % 2 == 1) {
            System.out.println(1 + resultFor(n - 1));
        }

    }
}
