package pl.szymonleyk.queue;

import pl.szymonleyk.stack.Book;

import java.sql.SQLOutput;
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

            Person person;
            switch (option) {
                case 1:
                    System.out.println(personQueue.empty());
                    break;
                case 2:
                    person = personQueue.front();
                    if(person != null) {
                        System.out.println(person);
                    }
                    break;
                case 3:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    person = new Person(name);
                    personQueue.push(person);
                    break;
                case 4:
                    personQueue.pop();
                    break;
            }
        } while(option != 0);
    }
}
