package rvt;

import java.util.*;

public class JmArrayList {

    public static void main(String[] args) {
      OnlyTheseNumbers();
    }
    public static void OnlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Ievada ciparu (Enter -1 to end): ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("From where? ");
        int start = scanner.nextInt();

        System.out.println("To where? ");
        int end = scanner.nextInt();
        System.out.println(" ");
        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
        scanner.close();
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
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Ievada vardu (press Enter to start searching):");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (names.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        scanner.close();
        
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
    public static void removeLastUzd() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
        
    }

}
