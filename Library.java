
import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getBookId() == book.getBookId()) {
                System.out.println("Book with this ID already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println(book.getBookname() + " added to the library successfully");

    }

    public void registerUser(User user) {
        for (User u : users) {
            if (u.getUserId() == user.getUserId()) {
                System.out.println("User with the Id already exist. ");
                return;
            }
        }
        users.add(user);
        System.out.println(user.getUserName() + " added sucessfully in the DB");

    }

    public void issueBook(int bookId, int userId) {
        Book founBook = null;
        User foundUser = null;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                founBook = b;
                break;
            }
        }
        for (User u : users) {
            if (u.getUserId() == userId) {
                foundUser = u;
                break;
            }
        }
        if (founBook == null) {
            System.out.println("Book not found with ID: " + bookId);
            return;
        }
        if (foundUser == null) {
            System.out.println("User not found with ID: " + userId);
            return;
        }
        if (founBook.getIsIssued()) {
            System.out.println("Book is already issued. ");
        } else {
            foundUser.borrowBook(founBook);
            founBook.setIsIssued(true);
            System.out.println("Book '" + founBook.getBookname() + "' issued to " + foundUser.getUserName());

        }
    }

    public void returnBook(int bookId, int userId) {
        Book founBook = null;
        User foundUser = null;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                founBook = b;
                break;
            }
        }
        for (User u : users) {
            if (u.getUserId() == userId) {
                foundUser = u;
                break;
            }
        }
        if (founBook == null) {
            System.out.println("Book not found with ID: " + bookId);
            return;
        }
        if (foundUser == null) {
            System.out.println("User not found with ID: " + userId);
            return;
        }
        if (founBook.getIsIssued()) {
            if (!foundUser.getBorrowedBooks().contains(founBook)) {
                System.out.println("This user did not borrow this book.");
                return;
            }

            founBook.setIsIssued(false);
            foundUser.returnBook(founBook);
            System.out.println("Book '" + founBook.getBookname() + "' returned by " + foundUser.getUserName());
          

        } else {
            System.out.println("Book is not issued ");
        }
    }

    public void displayAvailableBooks() {
        int count = 0;
        for (Book b : books) {
            if (!b.getIsIssued()) {
                System.out.println((count + 1) + ") Book Id: " + b.getBookId()+ ", Book Name: " + b.getBookname()+ ", Author Name: " + b.getAuthorName());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No books are currently available.");
        }
    }

}
