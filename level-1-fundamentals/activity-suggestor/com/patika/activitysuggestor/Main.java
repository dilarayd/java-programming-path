package com.patika.activitysuggestor;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int heat;
    Scanner input = new Scanner(System.in);
    System.out.print("Heat: ");
    heat = input.nextInt();

    if (heat < 5) {
      System.out.println("You can go skiing!");
    } else if (heat <= 25) {
      if (heat <= 15) {
        System.out.println("You can go to cinema!");
      }
      if (heat >= 15) {
        System.out.println("You can go on a picnic");
      }
    } else {
      System.out.println("You can go swimming!");
    }
  }
}
