public class book {
    private String title;
    private String author;
    private String isbn;
    public static int totalbooks = 0;

    public book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalbooks++;
    }

    public static void displayTotalbooks() {
        System.out.println("Total books: "   + totalbooks);
    }

    public static void main(String[] args) {
        book book1 = new book("book satu", "Author satu", "ISBN001");
        book book2 = new book("book dua", "Author dua", "ISBN002");
        book book3 = new book("book tiga", "Author tiga", "ISBN003");
        book.displayTotalbooks();
    }
}