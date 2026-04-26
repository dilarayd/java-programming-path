package com.patika.taximeter;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double distance, total;
    double perKm = 2.20;
    double minPrice = 20.00;
    double startPrice = 10.00;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the distance in KM: ");
    distance = scan.nextDouble();
    total = startPrice + (distance * perKm);
    total = Math.max(total, minPrice);
    System.out.println("The total price is " + total + " TL");
    scan.close();
  }
}
