package sky.pro.homework12;

import java.time.LocalDate;

public class Book {
    private String bookName;
    private Author authorName;
    private int yearOfPublishing;

    public Book(String name, Author author, int year) {
        this.bookName = name;
        this.authorName = author;
        this.yearOfPublishing = year;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if (yearOfPublishing < 0 || yearOfPublishing > (LocalDate.now().getYear())) {
            System.out.println("Invalid year of publishing " + yearOfPublishing);
            return;
        }
        this.yearOfPublishing = yearOfPublishing;
    }
}
