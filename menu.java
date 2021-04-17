import java.util.Scanner;

public class menu {

  public static void options() {
    Main calc = new Main();

    Scanner objOperator = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Which operation would you like to do?\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power");

    try {
      String op = objOperator.nextLine();  // Read user input


      int opInt = Integer.parseInt(op);

      Scanner objNum1 = new Scanner(System.in);
      Scanner objNum2 = new Scanner(System.in);

      if (opInt == 1) {
        System.out.print("Enter your first number: ");

        try {
          String num1 = objNum1.nextLine();
          double num1Double = Double.parseDouble(num1);

          System.out.print("\nEnter your second number: ");

          String num2 = objNum2.nextLine();
          double num2Double = Double.parseDouble(num2);

          calc.Add(num1Double, num2Double);

        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

        }

        System.out.println(calc.addedNum);

      } else if (opInt == 2) {
        System.out.print("Enter your first number: ");

        try {
          String num1 = objNum1.nextLine();
          double num1Double = Double.parseDouble(num1);

          System.out.print("\nEnter your second number: ");

          String num2 = objNum2.nextLine();
          double num2Double = Double.parseDouble(num2);

          calc.Sub(num1Double, num2Double);

        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

        }

        System.out.println(calc.subtractedNum);

      } else if (opInt == 3) {
        System.out.print("Enter your first number: ");

        try {
          String num1 = objNum1.nextLine();
          double num1Double = Double.parseDouble(num1);

          System.out.print("\nEnter your second number: ");

          String num2 = objNum2.nextLine();
          double num2Double = Double.parseDouble(num2);

          calc.Multi(num1Double, num2Double);

        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

        }

        System.out.println(calc.multipliedNum);

      } else if (opInt == 4) {
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
            calc.Rem(num1Double, num2Double);
            System.out.println(calc.remainderedNum);
          } else {
            calc.Div(num1Double, num2Double);
            System.out.println(calc.dividedNum);
          }

        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");

        }

      } else if (opInt == 5) {
        System.out.print("Enter your number: ");

        try {
          String num1 = objNum1.nextLine();
          double num1Double = Double.parseDouble(num1);
          calc.Pow(num1Double);
        } catch (NumberFormatException nfe) {
          System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a   number?");
        }

        System.out.println(calc.powedNum);

      } else {
        System.out.println("Invalid Input!");

      }

    } catch (NumberFormatException nfe) {
      System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");

    }

  }


}
  
