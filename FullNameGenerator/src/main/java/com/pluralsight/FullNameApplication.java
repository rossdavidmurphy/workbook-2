package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type your first name: ");
        String firstName = input.nextLine().trim();

        System.out.println("Type your middle name (Press enter to skip): ");
        String middleName = input.nextLine().trim();

        System.out.println("Type your last name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Type your suffix (Press enter to skip): ");
        String suffix = input.nextLine().trim();

        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName + " " + suffix;
        }
        if (suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        System.out.println(fullName);

    }
}
