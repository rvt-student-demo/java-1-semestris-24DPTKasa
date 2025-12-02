package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String order = scanner.nextLine();

        System.out.println("Ievadi canu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspress piegāde (0 == nē, 1 == jā): ");
        int express = scanner.nextInt();

        double dostavka = 0;
        double fast_dostavka = 0;
        if (express == 1) {
            fast_dostavka = 3;
        }
        if (cena < 10){
            dostavka = 2;
            if (cena > 10){
              dostavka = 0;  
            }
        }

        double dostavka_otvet = dostavka + fast_dostavka;

        double kopa = cena + dostavka_otvet; 

        System.out.println("Rekiins: ");
        System.out.println("  " + order + "  " + cena);
        System.out.println("  " + "piegade: " + dostavka_otvet);
        System.out.println("  " + "kopa: " + kopa);

        scanner.close();
    }
    
    
}
