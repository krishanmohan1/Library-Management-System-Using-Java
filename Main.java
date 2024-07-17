import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Add some books
        Book book1 = new Book("Java Programming", "John Doe", "123456");
        Book book2 = new Book("Data Structures", "Jane Doe", "789101");
        Book book3 = new Book("Algorithms", "John Smith", "112131");
        Book book4 = new Book("Java for Beginners", "Jane Doe", "141516");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Add some users
        User user1 = new User("U001", "Alice");
        User user2 = new User("U002", "Bob");
        library.addUser(user1);
        library.addUser(user2);

        // Display all books
        System.out.println("All Books in the Library:");
        library.displayAllBooks();

        // Display all users
        System.out.println("\nAll Users in the Library:");
        library.displayAllUsers();

        // Borrow a book
        System.out.println("\nAlice borrows 'Java Programming':");
        user1.borrowBook(book1);

        // Display borrowed books of Alice
        System.out.println("Borrowed Books of Alice:");
        for (Book book : user1.getBorrowedBooks()) {
            System.out.println(book);
        }

        // Return a book
        System.out.println("\nAlice returns 'Java Programming':");
        user1.returnBook(book1);

        // Display borrowed books of Alice after returning
        System.out.println("Borrowed Books of Alice after returning:");
        for (Book book : user1.getBorrowedBooks()) {
            System.out.println(book);
        }

        // Search for a book by title
        System.out.println("\nSearching for 'Data Structures' by title:");
        Book searchedBook = library.searchBookByTitle("Data Structures");
        if (searchedBook != null) {
            System.out.println(searchedBook);
        } else {
            System.out.println("Book not found.");
        }

        // Search for books by author
        System.out.println("\nSearching for books by author 'Jane Doe':");
        List<Book> booksByAuthor = library.searchBooksByAuthor("Jane Doe");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }

        // Search for a book by ISBN
        System.out.println("\nSearching for book by ISBN '112131':");
        Book bookByISBN = library.searchBookByISBN("112131");
        if (bookByISBN != null) {
            System.out.println(bookByISBN);
        } else {
            System.out.println("Book not found.");
        }

        // Sort books by title
        System.out.println("\nSorting books by title:");
        library.sortBooksByTitle();
        library.displayAllBooks();
    }
}
