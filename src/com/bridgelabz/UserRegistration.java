package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationFunctions functions = new UserRegistrationFunctions();

        System.out.print("Enter First name  : ");
        String firstName = scanner.nextLine();
        functions.checkFirstName(firstName);

        System.out.print("Enter last name : ");
        String lastName = scanner.nextLine();
        functions.checkLastName(lastName);

        System.out.print("Enter Email Id : ");
        String email = scanner.nextLine();
        functions.checkEmail(email);

        System.out.print("Enter Mobile no : ");
        String mobileNum = scanner.nextLine();
        functions.checkMobileNumber(mobileNum);

        System.out.println("Enter Password minimum 8 characters :");
        String password = scanner.nextLine();
        functions.checkPassword(password);

    }
}
