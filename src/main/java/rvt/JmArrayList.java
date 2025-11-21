package rvt;

import java.util.*;

public class JmArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Ievada vardu:");
            list.add(scanner.nextLine());
            String inputLine = scanner.nextLine();
            if (inputLine.isEmpty()) {
                System.out.println("Search for?");
                if (list.contains(scanner.nextLine())) {
                    System.out.println(scanner.nextLine() + "was found");
                }
                break;
            }

        }
        scanner.close();

    }

    public static void OnlyTheseNumbers() {
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Ievada vardu:");
            list.add(scanner.nextLine());
            String inputLine = scanner.nextLine();
            if (inputLine.isEmpty()) {
                break;
            }

        }

        int size = list.size();
        System.out.println("In total:" + size);
        scanner.close();

    }

    public static void onTheList() {
        
    }

    public static void removeLast(ArrayList<String> strings) {
    }

}
