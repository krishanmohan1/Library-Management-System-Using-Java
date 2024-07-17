import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Methods to add books and users
    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    // Method to search for books by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to search for books by author
    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Method to search for books by ISBN
    public Book searchBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // Method to sort books by title using two-pointer technique
    public void sortBooksByTitle() {
        books.sort((Book b1, Book b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    // Method to display all books
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Method to display all users
    public void displayAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}

