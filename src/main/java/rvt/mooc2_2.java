package rvt;

import java.util.Scanner;

public class mooc2_2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = 0;
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    while (true) {
        System.out.print("Ievadi pozitivu skaitli (0 vai negatīvs skaitlis partrauc ievadi): ");
        int num = scanner.nextInt();

        if (num <= 0) {
            break; 
        }

        count++;
        sum += num;

        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }

    System.out.println("\nIevadito skaitlu skaits: " + count);

    if (count > 0) {
        double average = (double) sum / count;

        System.out.println("Skaitlu summa: " + sum);
        System.out.println("Videja vertiba: " + average);
        System.out.println("Lielakais skaitlis: " + max);
        System.out.println("Mazakais skaitlis: " + min);
    } 

    scanner.close();
    
}
}
