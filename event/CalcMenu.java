package event;

import systems.*;
import java.util.Scanner;

public class CalcMenu {

  public static void Main () {

    Scanner inputOperator = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Which operation would you like to do?\n" +
            "1. Addition\n" +
            "2. Subtraction\n" +
            "3. Multiplication\n" +
            "4. Division\n" +
            "5. Power\n" +
            "6. Square Root");

    try {
      String op = inputOperator.nextLine();  // Read user input

      int opInt = Integer.parseInt(op);

      Scanner inputNum1 = new Scanner(System.in);
      Scanner inputNum2 = new Scanner(System.in);

      switch (opInt) {
        case 1: Calculator.addOp(inputNum1,inputNum2); break;
        case 2: Calculator.subOp(inputNum1, inputNum2); break;
        case 3: Calculator.multiOp(inputNum1, inputNum2); break;
        case 4: Calculator.divOp(inputNum1, inputNum2); break;
        case 5: Calculator.powOp(inputNum1, inputNum2); break;
        case 6: Calculator.sqrtOp(inputNum1); break;
        default: System.out.println("Invalid Input!");
      }

    } catch (NumberFormatException nfe) {
      Exceptions.numFormatException(nfe);
    }
  }
}