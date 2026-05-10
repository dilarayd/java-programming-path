package com.patika.combinationcalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int n, r;
    long combination;
    long nFactorial = 1;
    long rFactorial = 1;
    long nMinusRFactorial = 1;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number (n): ");
    n = sc.nextInt();
    System.out.print("Enter a number (r): ");
    r = sc.nextInt();

    if (r > n) {
      System.out.println("r cannot be greater than n");
      return;
    }

    for (int i = 1; i <= n; i++) {
      nFactorial *= i;
    }
    for (int i = 1; i <= r; i++) {
      rFactorial *= i;
    }
    for (int i = 1; i <= (n - r); i++) {
      nMinusRFactorial *= i;
    }
    combination = nFactorial / (rFactorial * nMinusRFactorial);
    System.out.println("C(" + n + "," + r + ") = " + combination);
    sc.close();
  }
}
