package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println(" Welcome to the Library Manager!");
        System.out.println("---------------------------------");

        mainMenu();
    }

    public static void mainMenu() {
        while(true) {
            System.out.println("1. List all books");
            System.out.println("2. Add book");
            System.out.println("3. Remove book");
            System.out.println("4. Search by author");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                listAllBooks();
            } else if (choice.equals("2")) {
                addBook();
            } else if (choice.equals("3")) {
                removeBook();
            } else if (choice.equals("4")) {
                searchByAuthor();
            } else if (choice.equals("5")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void listAllBooks() {
        for (Book item : library) {
            System.out.println(item.toString());
        }
    }

    public static void addBook() {
        System.out.println("1. Fiction book");
        System.out.println("2. Reference book");
        String newChoice = scanner.nextLine();
        if (newChoice.equals("1")) {

            System.out.println("Enter title:");
            String title = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter ID number:");
            int idNumber = scanner.nextInt();
            System.out.println("Enter genre");
            String genre = scanner.nextLine();

            library.add(new FictionBook(title, author, idNumber, genre));
        } else if (newChoice.equals("2")) {

            System.out.println("Enter title:");
            String title = scanner.nextLine();
            System.out.println("Enter author:");
            String author = scanner.nextLine();
            System.out.println("Enter ID number:");
            int idNumber = scanner.nextInt();
            System.out.println("Enter edition number");
            int editionNumber = scanner.nextInt();

            library.add(new ReferenceBook(title, author, idNumber, editionNumber));
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static void removeBook() {
        System.out.println("Enter ID number:");
        int idNumber = scanner.nextInt();
        library.removeIf(s -> s.getID() == idNumber);
    }

    public static void searchByAuthor() {
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        List<Book> newList = new ArrayList<>();
        for (Book item : library) {
            if (Objects.equals(item.getAuthor(), author)) {
                newList.add(item);
            }
        }
        for (Book item : newList) {
            System.out.println(item.toString());
        }
    }
    }