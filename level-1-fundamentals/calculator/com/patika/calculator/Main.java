package com.patika.calculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double n1, n2;
    String select;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    n1 = input.nextDouble();
    System.out.print("Enter the second number: ");
    n2 = input.nextInt();
    System.out.print("Choose your operation: (+ , - , *, /): ");
    select = input.next();
    switch (select) {
      case "+":
        System.out.print("Result: " + (n1 + n2));
        break;
      case "-":
        System.out.print("Result: " + (n1 - n2));
        break;
      case "*":
        System.out.print("Result: " + (n1 * n2));
        break;
      case "/":
        if (n2 != 0) {
          System.out.print("Result: " + (n1 / n2));
        } else {
          System.out.println("Error: A number cannot be divided by zero!");
        }
        break;
      default:
        System.out.println("Error: Invalid operation selected.");
    }
    input.close();
  }
}
