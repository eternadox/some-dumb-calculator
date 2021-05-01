import event.*;
import java.util.Scanner;
import systems.Salary;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Which program would you like to run?\n\n" +
            "1. Simple Calculator\n" +
            "2. Salary Calculator\n" +
            "3. 3D Volume Calculator");
    int option = input.nextInt();

    switch (option) {
      case 1: CalcMenu.Main(); break;
      case 2: Salary.calculate(); break;
      case 3: VolumeMenu.Main(); break;
      }

  }
}
