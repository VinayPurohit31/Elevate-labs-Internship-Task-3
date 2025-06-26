
public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean isIssued;

    public Book(int bookId,String bookName,String authorName,boolean isIssued) {
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
        this.isIssued=isIssued;
    }

    

    public int getBookId() {
        return bookId;
    }

    public String getBookname() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean getIsIssued() {
        return isIssued;
    }


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAurhorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    @Override
    public String toString() {
        return "Book Id" + bookId + " BookName " + bookName + " Aurhor name " + authorName + " is issued " + isIssued;
    }

}
