package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
//    public static void main(String[] args) {
//
//        String billingAddress = getAddress();
//        System.out.println("Billing Address:");
//        System.out.println(billingAddress);
//
//    }
//    public static String getAddress() {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Street address: ");
//        String street = input.nextLine().trim();
//
//        System.out.println("City: ");
//        String city = input.nextLine().trim();
//
//        System.out.println("State: ");
//        String state = input.nextLine().trim();
//
//        System.out.println("Zip Code: ");
//        String zipCode = input.nextLine().trim();
//
//        input.close();
//
//        return street + "\n" + city + ", " + state + " " + zipCode;
//    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Billing Street");
        String billingStreet = input.nextLine().trim();

        System.out.println("Billing City");
        String billingCity = input.nextLine().trim();

        System.out.println("Billing State");
        String billingState = input.nextLine().trim();

        System.out.println("Billing Zip");
        String billingZip = input.nextLine().trim();

        displayAddress(billingStreet, billingCity, billingState, billingZip);

    }

    private static void displayAddress(String billingStreet, String billingCity, String billingState, String billingZip) {
        StringBuilder builder = new StringBuilder();
        builder.append(billingStreet).append("\n");
        builder.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip);

        String address = builder.toString();
        System.out.println(address);
    }
}
