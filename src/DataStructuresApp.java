import java.util.Scanner;

public class DataStructuresApp {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        do {
            System.out.println("---- Books Stack ----");
            System.out.println("1 - is empty?");
            System.out.println("0 - stop");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(bookStack.empty());
                    break;
            }
        } while(option != 0);
    }
}
