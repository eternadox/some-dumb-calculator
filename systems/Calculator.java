package systems;

import java.util.Scanner;

public class Calculator {

// addition method
  public static void Add(double num1, double num2) {

    double addedNum = num1 + num2;
    System.out.println("Your answer is: " + addedNum);

  }

// subtraction method
  public static void Sub(double num1, double num2) {

    double subtractedNum = num1 - num2;
    System.out.println("Your answer is: " + subtractedNum);

  }

// multiplication method
  public static void Multi(double num1, double num2) {

    double multipliedNum = num1 * num2;
    System.out.println("Your answer is: " + multipliedNum);

  }
  
// division method
  public static void Div(double num1, double num2) {

    double dividedNum = num1 / num2;
    System.out.println("Your answer is: " + dividedNum);

  }

// remainder method
  public static void Rem(double num1, double num2) {

    double remainderedNum = num1 % num2;
    System.out.println("Your answer is: " + remainderedNum);

  }

  public static void addOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      Add(num1, num2);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }
  }

  public static void subOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      Sub(num1, num2);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }
  }

  public static void multiOp(Scanner inputNum1, Scanner inputNum2) {


    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("\nEnter your second number: "); double num2 = inputNum2.nextDouble();

      Multi(num1, num2);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
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
        case 1: Rem(num1, num2); break;
        case 2: Div(num1, num2); break;
      }

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }
  }

  public static void powOp(Scanner inputNum1, Scanner inputNum2) {

    try {
      System.out.print("Enter your first number: "); double num1 = inputNum1.nextDouble();
      System.out.print("Enter your second number: "); double num2 = inputNum2.nextDouble();

      System.out.println("Your answer is: " + Math.pow(num1, num2));

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }
  }

  public static void sqrtOp(Scanner inputNum1) {

    try {
      System.out.println("Enter your number: "); double num1 = inputNum1.nextDouble();
      System.out.println("Your answer is: " + Math.sqrt(num1));

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }
  }

}
  
