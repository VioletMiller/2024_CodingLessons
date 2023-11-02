package main.java.hello;

import java.util.Scanner;

public class HelloWorld {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] varArgs) {

        System.out.println("Happy Halloween!");

        System.out.println("What is the radius of this circle?");

        double providedradius = scanner.nextDouble();

        Circle mycircle       = new Circle();

        System.out.println("The area of the circle before I change it is " + mycircle.area());

        mycircle.setRadius(providedradius);

        System.out.println("The area of the circle after I change it is " + mycircle.area());



    }


}