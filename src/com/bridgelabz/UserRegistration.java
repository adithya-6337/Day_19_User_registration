package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password minimum 8 characters : ");
        String password = scanner.nextLine();
        checkPasswordRuleNoFour(password);
    }

    private static void checkPasswordRuleNoFour(String mobilNum) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(mobilNum);

        if (matcherCheck.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
