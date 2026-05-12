package com.patika.armstrongnumberchecker;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number, tempNumber, digit;
    int numbersOfDigit = 0;
    int result = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    number = scan.nextInt();
    tempNumber = number;
    while (tempNumber != 0) {
      tempNumber /= 10;
      numbersOfDigit++;
    }
    tempNumber = number;
    while (tempNumber != 0) {
      digit = tempNumber % 10;
      int powerResult = 1;
      for (int i = 1; i <= numbersOfDigit; i++) {
        powerResult *= digit;
      }
      result += powerResult;
      tempNumber /= 10;
    }
    if (result == number) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}
