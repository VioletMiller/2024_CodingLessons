package main.java.hello;

import java.util.Scanner;

public class Receipt {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arges) {
        System.out.println("How much does this cost?");
        double cost = scanner.nextDouble();

    static final double TAX_RATE = 0.13;System.out.println("Taxes"+TAX_RATE);



}

