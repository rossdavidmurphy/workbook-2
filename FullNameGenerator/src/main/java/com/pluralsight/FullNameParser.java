package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        System.out.println("Enter your full name: ");

        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine().trim();
        System.out.println(fullName);
        int firstPositionOfSpace = fullName.indexOf(' ');
//        int secondPositionOfSpace = fullName.lastIndexOf(' ');
//        System.out.println(secondPositionOfSpace);
        String firstName = fullName.substring(0, firstPositionOfSpace);
        String lastName = fullName.substring(firstPositionOfSpace + 1);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
