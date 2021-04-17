package systems;

import java.util.Scanner;

public class calculator {

// addition method
  public static void Add(double num1, double num2) {

    double addedNum = num1 + num2;
    System.out.println(addedNum);

  }

// subtraction method
  public static void Sub(double num1, double num2) {

    double subtractedNum = num1 - num2;
    System.out.println(subtractedNum);

  }

// multiplication method
  public static void Multi(double num1, double num2) {

    double multipliedNum = num1 * num2;
    System.out.println(multipliedNum);

  }
  
// division method
  public static void Div(double num1, double num2) {

    double dividedNum = num1 / num2;
    System.out.println(dividedNum);

  }

// remainder method
  public static void Rem(double num1, double num2) {

    double remainderedNum = num1 % num2;
    System.out.println(remainderedNum);

  }

// power method
  public static void Pow(double powNum) {

    double powedNum = powNum * powNum;
    System.out.println(powedNum);

  }

  public static void addOp(Scanner objNum1, Scanner objNum2) {
    System.out.print("Enter your first number: ");

    try {
      String num1 = objNum1.nextLine();
      double num1Double = Double.parseDouble(num1);

      System.out.print("\nEnter your second number: ");

      String num2 = objNum2.nextLine();
      double num2Double = Double.parseDouble(num2);

      Add(num1Double, num2Double);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

    }
  }

  public static void subOp(Scanner objNum1, Scanner objNum2) {
    System.out.print("Enter your first number: ");

    try {
      String num1 = objNum1.nextLine();
      double num1Double = Double.parseDouble(num1);

      System.out.print("\nEnter your second number: ");

      String num2 = objNum2.nextLine();
      double num2Double = Double.parseDouble(num2);

      Sub(num1Double, num2Double);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

    }
  }

  public static void multiOp(Scanner objNum1, Scanner objNum2) {
    System.out.print("Enter your first number: ");

    try {
      String num1 = objNum1.nextLine();
      double num1Double = Double.parseDouble(num1);

      System.out.print("\nEnter your second number: ");

      String num2 = objNum2.nextLine();
      double num2Double = Double.parseDouble(num2);

      Multi(num1Double, num2Double);

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

    }
  }

  public static void divOp(Scanner objNum1, Scanner objNum2) {
    System.out.print("Enter your first number: ");

    try {
      String num1 = objNum1.nextLine();
      double num1Double = Double.parseDouble(num1);

      System.out.print("\nEnter your second number: ");

      String num2 = objNum2.nextLine();
      double num2Double = Double.parseDouble(num2);

      System.out.println("Would you like to find the remainder? (1 = Yes/0 = No)");

      Scanner objWhich = new Scanner(System.in);
      String which = objWhich.nextLine();
      int whichInt = Integer.parseInt(which);

      if (whichInt == 1) {
        Rem(num1Double, num2Double);
      } else {
        Div(num1Double, num2Double);
      }

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

    }
  }

  public static void powOp(Scanner objNum1) {
    System.out.print("Enter your number: ");

    try {
      String num1 = objNum1.nextLine();
      double num1Double = Double.parseDouble(num1);
      calculator.Pow(num1Double);
    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");
    }
  }

}
  
