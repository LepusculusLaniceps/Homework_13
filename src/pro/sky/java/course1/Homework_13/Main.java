import pro.sky.java.course1.Homework_13.Author;
import pro.sky.java.course1.Homework_13.Book;

public class Main {
    public static void main(String[] args) {
        Author steinbeck = new Author("Джон", "Стейнбек");
        Author keyes = new Author("Дэниел", "Киз");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book ofMiceAndMen = new Book("О мышах и людях", steinbeck, 1937);
        Book flowersForAlgernon = new Book("Цветы для Элджернона", keyes, 1966);
        Book nineteenEightyFour = new Book("1984", orwell, 1956);

        printBook(flowersForAlgernon);

        System.out.println(ofMiceAndMen.equals(nineteenEightyFour));
        System.out.println(ofMiceAndMen.equals(flowersForAlgernon));


    }
    private static void printBook(Book book) {
        System.out.println(book.toString());
    }
}



