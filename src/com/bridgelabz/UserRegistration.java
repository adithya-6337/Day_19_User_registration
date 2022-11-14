package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mobile no : ");
        String mobileNum = scanner.nextLine();
        checkMobileNumber(mobileNum);
    }

    private static void checkMobileNumber(String mobilNum) {
        String regex = "^[0-9]{2}+[ ][0-9]{10}$";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(mobilNum);

        if (matcherCheck.matches()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
