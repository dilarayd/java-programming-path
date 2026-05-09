package com.patika.userlogin;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String username, password, choice, newPassword;
    Scanner input = new Scanner(System.in);
    System.out.print("Username: ");
    username = input.nextLine();
    System.out.print("Password: ");
    password = input.nextLine();

    if (username.equals("patika") && password.equals("java123")) {
      System.out.println("Login successful!");
    } else if (!username.equals("patika")) {
      System.out.println("Incorrect credentials.");
    } else {
      System.out.println("Incorrect credentials.");
      System.out.print("Would you like to reset your password? (y/n): ");
      choice = input.nextLine();
      if (choice.equals("y")) {
        System.out.print("Enter your new password: ");
        newPassword = input.nextLine();
        if (newPassword.equals("java123")) {
          System.out.println(
              "Could not create password: New password cannot be the same as the old one.");
        } else {
          System.out.println("Password successfully created!");
        }
      } else {
        System.out.println("Login failed.");
      }
    }
    input.close();
  }
}
