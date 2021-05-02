package systems;

import event.Exceptions;
import java.util.Scanner;

public class Calculator {

  public static void addOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Your answer is: " + (num1 + num2));

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }

  public static void subOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Your answer is: " + (num1 - num2));

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }

  public static void multiOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Your answer is: " + num1 * num2);

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }

  public static void divOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Would you like to find the remainder? (1 = Yes/0 = No)");

      Scanner inputWhich = new Scanner(System.in);
      String which = inputWhich.nextLine();
      int whichInt = Integer.parseInt(which);

      switch (whichInt) {
        case 1: System.out.println("Your answer is: " + num1 % num2); break;
        case 2: System.out.println("Your answer is: " + num1 / num2); break;
      }

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }

  public static void powOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("Enter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Your answer is: " + Math.pow(num1, num2));

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }

  public static void sqrtOp(Scanner inputNum1) {

    try {
      System.out.println("Enter your number: "); double num1 = inputNum1.nextDouble();
      System.out.println("Your answer is: " + Math.sqrt(num1));

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }
}