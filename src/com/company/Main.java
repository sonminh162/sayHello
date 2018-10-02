package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String name;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter name:");
        name = scanner.nextLine();
        System.out.printf("Hello "+name);
    }
}
