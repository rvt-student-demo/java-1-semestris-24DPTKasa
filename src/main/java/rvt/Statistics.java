package rvt;

import java.util.Scanner;

public class Statistics {
// Part 1
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {

    // Part 2
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

    // Part 3
        Scanner scanner = new Scanner(System.in);
        Statistics userStats = new Statistics();
        System.out.println("Enter numbers( Enter -1 to end ):  ");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            userStats.addNumber(input);
        }
        System.out.println("Sum: " + userStats.sum());
    // Part 4

        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        System.out.println("Enter numbers( Enter -1 to end ): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            allNumbers.addNumber(num);
            if (num % 2 == 0) {
                evenNumbers.addNumber(num);
            } else {
                oddNumbers.addNumber(num);
            }
        }
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
        scanner.close();
    }  

}
