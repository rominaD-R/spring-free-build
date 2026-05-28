package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<LibraryItem> library = new ArrayList<>();

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
        for (LibraryItem item : library) {
            System.out.println(item);
        }
    }

    public static void addBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter ID number:");
        int idNumber = scanner.nextInt();
        System.out.println("Enter description:");
        String description = scanner.nextLine();

        library.add(new Book(title, author, idNumber, description));
    }

    public static void removeBook() {
        System.out.println("Enter ID number:");
        int idNumber = scanner.nextInt();
        library.removeIf(s -> idNumber.equals(s.idNumber));
    }

    public static void searchByAuthor() {
// fill
    }