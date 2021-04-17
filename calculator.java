import java.util.Scanner;

public class calculator {
  // instances
  double addedNum;
  double subtractedNum;
  double multipliedNum;
  double dividedNum;
  double remainderedNum;
  double powedNum;


// addition method
  public void Add(double num1, double num2) {

    addedNum = num1 + num2;

  }

// subtraction method
  public void Sub(double num1, double num2) {

    subtractedNum = num1 - num2;

  }

// multiplication method
  public void Multi(double num1, double num2) {

    multipliedNum = num1 * num2;

  }
  
// divison method
  public void Div(double num1, double num2) {

    dividedNum = num1 / num2;

  }

// remainder method
  public void Rem(double num1, double num2) {

    remainderedNum = num1 % num2;

  }

// power method
  public void Pow(double powNum) {

    powedNum = powNum * powNum;

  }

}
  
