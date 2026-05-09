package com.patika.divisibleaveragecalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number;
    int counter = 0;
    int sum = 0;
    double average;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = scan.nextInt();

    for (int i = 1; i <= number; i++) {
      if (i % 12 == 0) {
        sum += i;
        counter++;
      }
    }
    if (counter > 0) {
      average = (double) sum / counter;
      System.out.println("Average is " + average);
    } else {
      System.out.println("No numbers divisible by 3 and 4 were found in this range.");
    }
    scan.close();
  }
}
