package com.patika.vatcalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double price, vatRate, vatAmount, totalWithVat;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the price amount: ");
    price = input.nextDouble();
    vatRate = (price > 0 && price <= 1000) ? 0.18 : 0.08;
    vatAmount = price * vatRate;
    totalWithVat = price + vatAmount;

    System.out.println("Price without VAT: " +price);
    System.out.println("VAT rate is: " + vatRate);
    System.out.println("VAT Amount: " + vatAmount);
    System.out.println("Price with VAT: " + totalWithVat);
    input.close();
  }
}
