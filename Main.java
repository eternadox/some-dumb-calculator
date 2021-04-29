import event.calcMenu;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Which program would you like to run?\n\n" +
            "1. Simple Calculator\n" +
            "2. Salary Calculator");
    int option = input.nextInt();

    if (option == 1) {
      calcMenu.Main();

    } else if (option == 2) {
      Salary.calculate();

    }

  }
}
