package org.example;

public class Book {
    protected String title;
    protected String author;
    protected int idNumber;

    public Book(String title, String author, int idNumber) {
        this.title = title;
        this.author = author;
        this.idNumber = idNumber;
    }

    public String toString() {
        return "Book " + idNumber + ":  " + title + " by " + author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getID() {
        return this.idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setID(int id) {
        this.idNumber = id;
    }
}
