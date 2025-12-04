package rvt;
import java.util.Scanner;
public class Detalas {
    
public static void main(String[] args) {

    final int boltPrice = 5;     
    final int uzgriezniPrice = 3;     
    final int paplaksniPrice = 1;   

    Scanner scanner = new Scanner(System.in);

      
    System.out.print("Skruvju skaits: ");
    int bolts = scanner.nextInt();
        
    System.out.print("Uzgrieznu skaits: ");
    int uzgriezni = scanner.nextInt();

    System.out.print("Paplaksnu skaits: ");
    int paplaksni = scanner.nextInt();

      
    boolean error = false;

    if (uzgriezni < bolts) {
        System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        error = true;
    }

    if (paplaksni < bolts * 2) {
        System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        error = true;
    }

    if (!error) {
        System.out.println("Pasutjums ir kartiba.");
    }

    
    int totalPrice = bolts * boltPrice + uzgriezni * uzgriezniPrice + paplaksni * paplaksniPrice;

    System.out.println("Kopa cena: " + totalPrice);
    scanner.close();
    }
}



