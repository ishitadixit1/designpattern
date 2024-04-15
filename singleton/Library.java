package singleton;

//In this example, the Library class acts as a singleton, ensuring that only one instance of the library exists throughout the program.
 //It manages available and borrowed books, allowing users to borrow and return books as needed
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static volatile Library instance;
    private List<String> availableBooks;
    private List<String> borrowedBooks;

    private Library() {
        // Initializing the lists
        availableBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public static Library getInstance() {
        if (instance == null) {
            synchronized (Library.class) {
                if (instance == null) {
                    instance = new Library();
                }
            }
        }
        return instance;
    }

    public void addBook(String bookTitle) {
        availableBooks.add(bookTitle);
    }

    public void borrowBook(String bookTitle) {
        if (availableBooks.contains(bookTitle)) {
            availableBooks.remove(bookTitle);
            borrowedBooks.add(bookTitle);
            System.out.println("You have borrowed \"" + bookTitle + "\".");
        } else {
            System.out.println("\"" + bookTitle + "\" is not available.");
        }
    }

    public void returnBook(String bookTitle) {
        if (borrowedBooks.contains(bookTitle)) {
            borrowedBooks.remove(bookTitle);
            availableBooks.add(bookTitle);
            System.out.println("You have returned \"" + bookTitle + "\".");
        } else {
            System.out.println("You have not borrowed \"" + bookTitle + "\".");
        }
    }

    public void displayAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (String book : availableBooks) {
                System.out.println("- " + book);
            }
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("You have not borrowed any books.");
        } else {
            System.out.println("Borrowed books:");
            for (String book : borrowedBooks) {
                System.out.println("- " + book);
            }
        }
    }
}
