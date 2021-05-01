package event;

import systems.*;
import java.util.Scanner;

public class CalcMenu {

  public static void Main () {

    Scanner objOperator = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Which operation would you like to do?\n" +
            "1. Addition\n" +
            "2. Subtraction\n" +
            "3. Multiplication\n" +
            "4. Division\n" +
            "5. Power\n" +
            "6. Square Root");

    try {
      String op = objOperator.nextLine();  // Read user input

      int opInt = Integer.parseInt(op);

      Scanner objNum1 = new Scanner(System.in);
      Scanner objNum2 = new Scanner(System.in);

      switch (opInt) {
        case 1: Calculator.addOp(objNum1,objNum2); break;
        case 2: Calculator.subOp(objNum1, objNum2); break;
        case 3: Calculator.multiOp(objNum1, objNum2); break;
        case 4: Calculator.divOp(objNum1, objNum2); break;
        case 5: Calculator.powOp(objNum1, objNum2); break;
        case 6: Calculator.sqrtOp(objNum1); break;
        default: System.out.println("Invalid Input!");
      }

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");

    }

  }


}
