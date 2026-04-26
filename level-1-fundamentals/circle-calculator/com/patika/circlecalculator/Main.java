package com.patika.circlecalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int radius, centerAngle;
    double perimeter, area;
    double pi = 3.14;
    Scanner scan = new Scanner(System.in);
    System.out.println("---CIRCLE CALCULATOR ---");
    System.out.print("Enter the radius of the circle: ");
    radius = scan.nextInt();
    area = pi * (radius * radius);
    perimeter = 2 * pi * radius;
    System.out.println("The perimeter of the circle " + perimeter);
    System.out.println("The area of the circle " + area);

    System.out.println("---\nCIRCULAR SECTOR AREA CALCULATOR---");
    System.out.print("Enter the center angle: ");
    centerAngle = scan.nextInt();
    area = (pi * (radius * radius) * centerAngle) / 360.0;
    System.out.println("The Area of a " + centerAngle + " degree sector: " + area);
    scan.close();
  }
}
