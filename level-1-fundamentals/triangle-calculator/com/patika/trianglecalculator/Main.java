package com.patika.trianglecalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double x, y, z, perimeter, semiPerimeter, area;
    Scanner input = new Scanner(System.in);
    System.out.println("--- TRIANGLE AREA CALCULATOR ---");
    System.out.print("Enter side A: ");
    x = input.nextDouble();
    System.out.print("Enter side B: ");
    y = input.nextDouble();
    System.out.print("Enter side C: ");
    z = input.nextDouble();
    perimeter = x + y + z;
    semiPerimeter = perimeter / 2.0;
    area = Math.sqrt(
        semiPerimeter * (semiPerimeter - x) * (semiPerimeter - y) * (semiPerimeter - z));
    System.out.println("The area of the triangle is " + area);

    System.out.println("\n---HYPOTENUSE CALCULATOR ---");
    double a, b, c;
    System.out.print("Enter the length of the first leg: ");
    a = input.nextDouble();
    System.out.print("Enter the length of the second leg: ");
    b = input.nextDouble();
    c = Math.sqrt((a * a) + (b * b));
    System.out.println("The hypotenuse is: " + c);
    input.close();
  }
}
