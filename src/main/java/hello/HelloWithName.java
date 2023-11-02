package main.java.hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("What is your last name?");

        String lastname = scanner.nextLine();

        System.out.println("What is your favourite candy?");

        String candy = scanner.nextLine();

        System.out.println("Hello " + name + " " + lastname + " I love " + candy);
    }

}
