
import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String name;
    List<Book> borrowBook = new ArrayList<>();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return name;
    }

     public void setUserId(int userId) {
        this.userId = userId;
    }
     public void setName(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if(!borrowBook.contains(book)){
            borrowBook.add(book);
            System.out.println("Book Borrowed Successfully ");
        }
    }

    public void returnBook(Book book) {
         if(borrowBook.contains(book)){
            borrowBook.remove(book);
            System.out.println("Book returned successfully Successfully ");
        }
    }

    public void displayBorrowBooks() {
        int count =0;
        for(Book b:borrowBook){
             System.out.println(count++ + ") Book Id" + b.getBookId() + " Book Name" + b.getBookname() + " Author Name " + b.getAuthorName());
        }
    }

    public List<Book> getBorrowedBooks() {
    return borrowBook;
}

}
