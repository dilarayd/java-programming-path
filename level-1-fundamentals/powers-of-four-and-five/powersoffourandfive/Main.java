package powersoffourandfive;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = scan.nextInt();

    System.out.println("Powers of 4:");
    for (int i = 1; i <= number; i *= 4) {
      System.out.println(i);
    }

    System.out.println("Powers of 5:");
    for (int i = 1; i <= number; i *= 5) {
      System.out.println(i);
    }
    scan.close();
  }
}
