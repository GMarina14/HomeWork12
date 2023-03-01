package sky.pro.homework12;

public class Author {
    private String NameOfAuthor;
    private String SurnameOfAuthor;

    public Author(String name, String surname) {
        this.NameOfAuthor = name;
        this.SurnameOfAuthor = surname;
    }

    public String getNameOfAuthor() {
        return this.NameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.SurnameOfAuthor;
    }

    public String getFullName() {
        return this.NameOfAuthor + " " + this.SurnameOfAuthor;
    }
}
