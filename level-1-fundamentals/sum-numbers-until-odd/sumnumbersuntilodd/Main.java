package sumnumbersuntilodd;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number;
    int sum = 0;
    Scanner scan = new Scanner(System.in);

    do {
      System.out.print("Enter a number: ");
      number = scan.nextInt();
      if (number % 4 == 0) {
        sum += number;
      }
    } while (number % 2 == 0);
    System.out.println("Sum of multiples of 4:");
    System.out.println(sum);
  }
}
