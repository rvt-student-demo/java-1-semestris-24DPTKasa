package rvt;

import java.util.Scanner;

public class mooc1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievada numuru:");
        int first = scanner.nextInt();

        System.out.println("Ievada numuru:");
        int second = scanner.nextInt();

        System.out.println("Ievada numuru:");
        int third = scanner.nextInt();

        double average = (first + second + third) / 3.0;

        System.out.println("average: " + average);
    }
}
