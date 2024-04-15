package singleton;
public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Adding some books to the library
        library.addBook("Harry Potter and the Sorcerer's Stone");
        library.addBook("The Great Gatsby");
        library.addBook("To Kill a Mockingbird");

        // Displaying the available books
        library.displayAvailableBooks();

        // Borrowing a book
        library.borrowBook("The Great Gatsby");

        // Displaying the borrowed books
        library.displayBorrowedBooks();

        // Returning a book
        library.returnBook("The Great Gatsby");

        // Displaying available books
        library.displayAvailableBooks();
    }
}

