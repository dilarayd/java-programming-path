package com.patika.exponentcalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int base, exponent;
    int total = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base: ");
    base = input.nextInt();
    System.out.print("Enter the exponent: ");
    exponent = input.nextInt();

    for (int i = 1; i <= exponent; i++) {
      total *= base;
    }
    System.out.println(base + " to the power of " + exponent + ": " + total);
    input.close();
  }
}
