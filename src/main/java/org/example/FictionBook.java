package org.example;

public class FictionBook extends Book {

    private String genre;

    public FictionBook(String title, String author, int idNumber, String genre) {
        super(title, author, idNumber);
        this.genre = genre;
    }

    public String toString() {
        return "Fiction book " + idNumber + ":  " + title + " by " + author + " about " + genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
