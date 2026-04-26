package com.patika.gradecalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int math, physics, chemistry, turkish, history, music;
    Scanner scan = new Scanner(System.in);
    System.out.print("Math grade: ");
    math = scan.nextInt();
    System.out.print("Physics grade: ");
    physics = scan.nextInt();
    System.out.print("Chemistry grade: ");
    chemistry = scan.nextInt();
    System.out.print("Turkish grade: ");
    turkish = scan.nextInt();
    System.out.print("History grade: ");
    history = scan.nextInt();
    System.out.print("Music grade: ");
    music = scan.nextInt();

    int total = math + physics + chemistry + turkish + history + music;
    double average = total / 6.0;
    System.out.println("Your average: " + average);
    String status = (average > 60) ? "Passed" : "Failed";
    System.out.println(status);
    scan.close();
  }
}
