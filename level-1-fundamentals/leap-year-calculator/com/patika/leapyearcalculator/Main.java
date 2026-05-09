package com.patika.leapyearcalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int year;
    boolean isLeapYear;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a year: ");
    year = scan.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      isLeapYear = true;
      System.out.println(year + " is a leap year.");
    } else {
      isLeapYear = false;
      System.out.println(year + " is not a leap year.");
    }
    scan.close();
  }
}
