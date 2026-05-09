package com.patika.gradeaverage;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int math, physics, turkish, chemistry, music;
    int total = 0;
    int count = 0;
    int passingGrade = 55;
    double averageGrade;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter math grade: ");
    math = scan.nextInt();
    System.out.print("Enter physics grade: ");
    physics = scan.nextInt();
    System.out.print("Enter turkish grade: ");
    turkish = scan.nextInt();
    System.out.print("Enter chemistry grade: ");
    chemistry = scan.nextInt();
    System.out.print("Enter music grade: ");
    music = scan.nextInt();

    if (math >= 0 && math <= 100) {
      total += math;
      count++;
    }
    if (physics >= 0 && physics <= 100) {
      total += physics;
      count++;
    }
    if (turkish >= 0 && turkish <= 100) {
      total += turkish;
      count++;
    }
    if (chemistry >= 0 && chemistry <= 100) {
      total += chemistry;
      count++;
    }
    if (music >= 0 && music <= 100) {
      total += music;
      count++;
    }

    if (count > 0) {
      averageGrade = (double) total / count;
      if (averageGrade >= passingGrade) {
        System.out.println("You passed");
      } else {
        System.out.println("You failed");
      }
      System.out.println("Average grade is " + averageGrade);
    }
  }
}
