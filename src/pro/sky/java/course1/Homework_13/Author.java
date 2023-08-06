package pro.sky.java.course1.Homework_13;

import java.util.Objects;

public class Author {
    private String firstName;
    private String surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return firstName + " " + surname;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
    @Override
    public boolean equals(Object i) {
        if (this == i) return true;
        if (i == null || getClass() != i.getClass()) return false;
        Author author = (Author) i;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surname, author.surname);
    }
}
