package book_shop;

class Book {
    String author;
    String title;
    double price;

    Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    private void setAuthor(String author) {
        if(author.split("\\s+").length > 1){
            String[] authorName = author.split("\\s+");
            if(Character.isDigit(authorName[1].charAt(0))){
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    private void setTitle(String title) {
        if(title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setPrice(double price) {
        if(price <= 0 ){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Type: Book\n" +
                "Title: %s\n" +
                "Author: %s\n" +
                "Price: %.1f",this.title,this.author,this.price);
    }
}
