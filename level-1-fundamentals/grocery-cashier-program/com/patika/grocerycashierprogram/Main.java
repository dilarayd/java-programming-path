package com.patika.grocerycashierprogram;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double kg;
    double pearPrice = 2.14;
    double applePrice = 3.67;
    double tomatoPrice = 1.11;
    double bananaPrice = 0.95;
    double eggplantPrice = 5.00;
    double totalPrice = 0.00;

    Scanner input = new Scanner(System.in);
    System.out.print("Pear (kg): ");
    kg = input.nextDouble();
    totalPrice += kg * pearPrice;
    System.out.print("Apple (kg): ");
    kg = input.nextDouble();
    totalPrice += kg * applePrice;
    System.out.print("Tomato (kg): ");
    kg = input.nextDouble();
    totalPrice += kg * tomatoPrice;
    System.out.print("Banana (kg): ");
    kg = input.nextDouble();
    totalPrice += kg * bananaPrice;
    System.out.print("Eggplant (kg): ");
    kg = input.nextDouble();
    totalPrice += kg * eggplantPrice;

    System.out.printf("Total price: %.2f TL\n ", totalPrice);
    input.close();
  }
}
