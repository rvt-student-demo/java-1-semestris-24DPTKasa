package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public class Main {

        public static class Book {
            private String title;
            private int pages;
            private int year;
    
            public Book(String title, int pages, int year) {
                this.title = title;
                this.pages = pages;
                this.year = year;
            }
    
            public String getTitle() {
                return this.title;
            }
    
            public String toString() {
                return this.title + ", " + this.pages + " pages, " + this.year;
            }
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Book> books = new ArrayList<>();
    
            while (true) {
                System.out.println("Title(Enter neko to print infromation):  ");
                String title = scanner.nextLine();
    
                if (title.isEmpty()) {
                    break;
                }
    
                System.out.println("Pages: ");
                int pages = scanner.nextInt();
    
                System.out.println("Publication year: ");
                int year = scanner.nextInt();
    
                books.add(new Book(title, pages, year));
            }
    
            System.out.println("\nWhat information will be printed? ('books names' or 'everything') ");
            String choice = scanner.nextLine();
    
            for (Book book : books) {
                if (choice.equals("everything")) {
                    System.out.println(book);
                } else if (choice.equals("books names")) {
                    System.out.println(book.getTitle());
                }
            }
            scanner.close();
        }
    }
}
