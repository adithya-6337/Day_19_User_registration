package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email Id : ");
        String email = scanner.nextLine();
        checkEmail(email);
    }

    private static void checkEmail(String emailId) {        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(emailId);

        if (matcherCheck.matches()) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
