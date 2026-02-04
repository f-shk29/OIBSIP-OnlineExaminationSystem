package com.myproject;

import java.util.Scanner;

public class Login {

    Scanner sc=new Scanner(System.in);

    public String authenticate() {

        System.out.print("Username: ");
        String username=sc.nextLine();

        System.out.print("Password: ");
        String password=sc.nextLine();

        // credentials
        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login successful!");
            return username;
        } else {
            System.out.println("\nInvalid credentials");
            return null;
        }
    }
}