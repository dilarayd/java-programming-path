package com.patika.chinesezodiaccalculator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int birthYear, zodiacIndex;
    String zodiacSign = "";
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your birth year: ");
    birthYear = scan.nextInt();
    zodiacIndex = birthYear % 12;

    zodiacSign = switch (zodiacIndex) {
      case 0 -> "Monkey";
      case 1 -> "Rooster";
      case 2 -> "Dog";
      case 3 -> "Pig";
      case 4 -> "Rat";
      case 5 -> "Ox";
      case 6 -> "Tiger";
      case 7 -> "Rabbit";
      case 8 -> "Dragon";
      case 9 -> "Snake";
      case 10 -> "Horse";
      case 11 -> "Sheep";
      default -> zodiacSign;
    };
    scan.close();
    System.out.println("Your Chinese Zodiac sign is: " + zodiacSign);
  }
}
