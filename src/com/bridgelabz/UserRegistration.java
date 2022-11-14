package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last name : ");
        String lastName = scanner.nextLine();
        checkLastName(lastName);
    }

    private static void checkLastName(String lastName) {
        String regex = "^[A-Z]+[a-zA-Z]{2,}[0-9]*$";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(lastName);

        if (matcherCheck.matches()) {
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is invalid");
        }
    }
}
