package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password minimum 8 characters : ");
        String password = scanner.nextLine();
        checkPasswordRuleOne(password);
    }

    private static void checkPasswordRuleOne(String mobilNum) {
        String regex = "^[a-zA-Z]{8,}";

        Pattern patternCheck = Pattern.compile(regex);
        Matcher matcherCheck = patternCheck.matcher(mobilNum);

        if (matcherCheck.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
