package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First name : ");
        String firstName = scanner.nextLine();
        checkFirstName(firstName);
    }

    private static void checkFirstName(String firstName) {
        String regex = "^[A-Z]+[a-zA-Z]{2,}[0-9]*$";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(firstName);

        if (matcherCheck.matches()) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is invalid");
        }
    }
}
