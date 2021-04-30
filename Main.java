import event.*;
import java.util.Scanner;
import systems.salary;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Which program would you like to run?\n\n" +
            "1. Simple Calculator\n" +
            "2. Salary Calculator\n" +
            "3. 3D Volume Calculator");
    int option = input.nextInt();

    if (option == 1) {
      calcMenu.Main();

    } else if (option == 2) {
      salary.calculate();

    } else if (option == 3) {
      volumeMenu.Main();

    }

  }
}
