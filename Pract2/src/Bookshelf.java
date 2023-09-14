import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book> books;

    public Bookshelf() {
        this.books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public Book earliest() {
        Book earliestBook = books.get(0);
        for (Book book : books) {
            if (book.getYear() < earliestBook.getYear()) {
                earliestBook = book;
            }
        }
        return earliestBook;
    }

    public Book oldest() {
        Book oldestBook = books.get(0);
        for (Book book : books) {
            if (book.getYear() > oldestBook.getYear()) {
                oldestBook = book;
            }
        }
        return oldestBook;
    }

    public void sortByYear() {
        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if (books.get(j).getYear() > books.get(j+1).getYear()) {
                    Book tbook = books.get(j+1);
                    books.set(j+1, books.get(j));
                    books.set(j, tbook);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + books +
                '}';
    }
}
