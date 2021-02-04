public class BookStack {
    private Book[] books = new Book[10];
    private int sptr = 0;

    public boolean empty(){
        return sptr == 0;
    }

}
