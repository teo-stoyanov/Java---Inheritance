package book_shop;

public class GoldenEditionBook extends Book {

    GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }

    @Override
    public String toString() {
        return String.format("Type: GoldenEditionBook\n" +
                "Title: %s\n" +
                "Author: %s\n" +
                "Price: %.1f", super.title, super.author, super.price * 1.3);
    }
}
