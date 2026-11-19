
class Book {

    // Book attributes
    String title;
    String author;
    int yearPublished;
    double price;

    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Convert book details into a String
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: PHP" + String.format("%.2f", price);
    }
}

public class Task11 {

    public static void main(String[] args) {

        // Create three Book objects
        Book book1 = new Book("The Non-Designer's Design Book", "Robin Williams", 2014, 350.06);
        Book book2 = new Book("Grid Systems in Graphic Design", "Josef Müller-Brockmann", 1981, 235.20);
        Book book3 = new Book("Thinking with Type", "Ellen Lupton", 2024, 750);

        // Display book details
        System.out.println("Book 1:");
        System.out.println(book1.toString());

        System.out.println("\nBook 2:");
        System.out.println(book2.toString());

        System.out.println("\nBook 3:");
        System.out.println(book3.toString());
    }
}
