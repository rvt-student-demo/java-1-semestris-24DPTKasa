package rvt;
import java.util.Scanner;

public class ch19 {
    public static void main(String[] args) {
        ex5();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start: ");
        int start = scanner.nextInt();
        System.out.println("Enter End: ");
        int end = scanner.nextInt();
        while (end +1 > start){ 
            System.out.println(start);
            start++;
        }
        scanner.close();
    }
    public static void ex2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int sum = N;
        for(int i = 1; i < N ; i++){
            sum += i;
        }
        System.out.println("Loop Sum = " + sum);

        int sum1 = N;
        sum1 = (N*(N+1))/2;
        System.out.println("Formula Sum = " + sum1);
        scanner.close();
        
    }
    public static void ex3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n+1; i++){
            sum += i * i ;
        }
        System.out.println("Loop Sum = " + sum);

        int sum1 = n;
        sum1 = (n*(n+1)*(2*n+1))/6;
        System.out.println("formula Sum = " + sum1);
        scanner.close();




    }
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = scanner.nextInt();
        System.out.println("Enter high: ");
        int n = scanner.nextInt();
        int sumhigh = 0;
        int sumlow = 0;
        for (int i = 1; i < n +1; i ++){
            sumhigh += i;
        }
        for (int i = 1; i <low ; i ++){
            sumlow += i;
        }
        System.out.println("Sumhigh = " + sumhigh);
        System.out.println("Sumlow = " + sumlow);
        
        int sum = sumhigh - sumlow;
        System.out.println("sum = " + sum);
       

    }
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word);
        int times;
        times = word.length();
        System.out.println(times);
        
    }
    public static void ex6(){}
    public static void ex7(){}

}
