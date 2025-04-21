package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(input.nextLine());

        System.out.println("What model is the phone?");
        cellPhone.setModel(input.nextLine());

        System.out.println("Who is the carrier?");
        cellPhone.setCarrier(input.nextLine());

        System.out.println("What is the phone number?");
        cellPhone.setPhoneNumber(input.nextLine());

        System.out.println("Who is the owner of the phone?");
        cellPhone.setOwner(input.nextLine());


        System.out.println(cellPhone.getSerialNumber(input.nextLine()));
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());
    }
}
