public class MainTest{
    public static void main(String []args){
         Library library = new Library();

        // Create some books
        Book book1 = new Book(101, "The Alchemist", "Paulo Coelho", false);
        Book book2 = new Book(102, "1984", "George Orwell", false);
        Book book3 = new Book(103, "Clean Code", "Robert C. Martin", false);
        Book book4 = new Book(104, "The Hobbit", "J.R.R. Tolkien", false);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Register users
        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        library.registerUser(user1);
        library.registerUser(user2);

        System.out.println("\n--- Available Books ---");
        library.displayAvailableBooks();

        // Issue books
        System.out.println("\n--- Issuing Books ---");
        library.issueBook(101, 1);  
        library.issueBook(102, 1);  
        library.issueBook(103, 2);  
        library.issueBook(101, 2);  

        System.out.println("\n--- Available Books After Issue ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Alice's Borrowed Books ---");
        user1.displayBorrowBooks();

        System.out.println("\n--- Bob's Borrowed Books ---");
        user2.displayBorrowBooks();

        // Return a book
        System.out.println("\n--- Returning Book ---");
        library.returnBook(101, 1);  
        library.returnBook(104, 2);  

        System.out.println("\n--- Available Books After Return ---");
        library.displayAvailableBooks();

        System.out.println("\n--- Alice's Borrowed Books After Return ---");
        user1.displayBorrowBooks();
    }
}