package event;

import systems.calculator;
import java.util.Scanner;

public class calcMenu {

  public static void Main () {

    Scanner objOperator = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Which operation would you like to do?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power");

    try {
      String op = objOperator.nextLine();  // Read user input

      int opInt = Integer.parseInt(op);

      Scanner objNum1 = new Scanner(System.in);
      Scanner objNum2 = new Scanner(System.in);

      switch (opInt) {
        case 1: calculator.addOp(objNum1,objNum2); break;
        case 2: calculator.subOp(objNum1, objNum2); break;
        case 3: calculator.multiOp(objNum1, objNum2); break;
        case 4: calculator.divOp(objNum1, objNum2); break;
        case 5: calculator.powOp(objNum1); break;
        default: System.out.println("Invalid Input!");
      }

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");

    }

  }


}