package com.patika.airticketcalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int distance, age, type;
    double price, ageDiscount = 0, returnDiscount = 0;

    Scanner scan = new Scanner(System.in);
    System.out.print("Distance(km): ");
    distance = scan.nextInt();
    System.out.print("Age: ");
    age = scan.nextInt();
    System.out.print("Type: ");
    type = scan.nextInt();

    if (age > 0 && distance > 0 && (type == 1 || type == 2)) {
      price = distance * 0.10;
      if (age < 12) {
        ageDiscount = price * 0.50;
      } else if (age <= 24) {
        ageDiscount = price * 0.10;
      } else if (age > 65) {
        ageDiscount = price * 0.30;
      } else {
        ageDiscount = 0;
      }
      price = price - ageDiscount;

      if (type == 2) {
        returnDiscount = price * 0.20;
        price = (price - returnDiscount) * 2;
      }
      System.out.println("Price: " + price + "TL");

    } else {
      System.out.println("Invalid input");
    }
    scan.close();
  }
}
