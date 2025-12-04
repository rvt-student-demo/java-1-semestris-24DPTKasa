package rvt;
import java.util.Scanner;

public class ch19 {
    public static void main(String[] args) {
        ex2();
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
            
    }
    public static void ex4(){}
    public static void ex5(){}
    public static void ex6(){}
    public static void ex7(){}

}
