package pl.szymonleyk.queue;

import pl.szymonleyk.stack.Book;

import java.util.Scanner;

public class QueueDataStructuresApp {
    public static void main(String[] args) {
        PersonQueue personQueue = new PersonQueue();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;
        do {
            System.out.println("---- Person Queue ----");
            System.out.println("1 - is empty");
            System.out.println("2 - front person");
            System.out.println("3 - push person");
            System.out.println("4 - pop person");
            System.out.println("0 - stop");

            option = scanner.nextInt();
            scanner.nextLine(); // \n

            Book book;
            switch (option) {
                case 1:
                    System.out.println(personQueue.empty());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while(option != 0);
    }
}
