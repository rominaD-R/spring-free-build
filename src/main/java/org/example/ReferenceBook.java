package org.example;

public class ReferenceBook extends Book {

    private int editionNumber;

    public ReferenceBook(String title, String author, int idNumber, int editionNumber) {
        super(title, author, idNumber);
        this.editionNumber = editionNumber;
    }

    public String toString() {
        return "Book " + idNumber + ":  " + title + " by " + author + ". Edition " + editionNumber;
    }

    public int getEditionNumber() {
        return this.editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

}
