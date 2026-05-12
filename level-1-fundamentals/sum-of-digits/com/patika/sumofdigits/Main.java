package com.patika.sumofdigits;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number;
    int result = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    number = sc.nextInt();

    while (number != 0) {
      result += number % 10;
      number = number / 10;
    }
    System.out.println("The sum of the digits is: " + result);
    sc.close();
  }
}
