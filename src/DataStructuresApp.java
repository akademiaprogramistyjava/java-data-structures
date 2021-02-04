import java.sql.SQLOutput;
import java.util.Scanner;

public class DataStructuresApp {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        do {
            System.out.println("---- Books Stack ----");
            System.out.println("1 - is empty");
            System.out.println("2 - top book");
            System.out.println("3 - push book");
            System.out.println("4 - pop book");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n

            Book book;
            switch (option) {
                case 1:
                    System.out.println(bookStack.empty());
                    break;
                case 2:
                    book = bookStack.top();
                    if(book != null) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    System.out.println("Title: ");
                    String title = scanner.nextLine();

                    System.out.println("Author: ");
                    String author = scanner.nextLine();

                    book = new Book(title, author);
                    bookStack.push(book);
                    break;
                case 4:
                    bookStack.pop();
                    break;
            }
        } while(option != 0);
    }
}
