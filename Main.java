import event.*;
import java.awt.*;
import java.util.Scanner;
import systems.*;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    GUI();
    
    int loop = 0;
    while (loop = 0) {
      Scanner input = new Scanner(System.in);
      System.out.println("Which program would you like to run?\n\n" +
            "1. Basic Calculator\n" +
            "2. Salary Calculator\n" +
            "3. 3D Volume Calculator");

      try {
        int option = input.nextInt();

        switch (option) {
          case 1: CalcMenu.Main(); loop = 1; break;
          case 2: Salary.calculate();loop = 1; break;
          case 3: VolumeMenu.Main(); loop = 1; break;
        }

      } catch (NumberFormatException nfe) {
        Exceptions.numFormatException(nfe);
      }
    }

  }

  public static void GUI() {
    JFrame frame = new JFrame();

    final JTextField tf=new JTextField();
    tf.setBounds(50,50, 150,20);

    JButton simpleCalculator = new JButton("Simple Calculator");
    simpleCalculator.setBounds(50,100,95,30);
    simpleCalculator.addActionListener(e -> CalcMenu.Main());

    JButton salaryCalculator = new JButton("Salary Calculator");
    salaryCalculator.setBounds(50,100,95,30);
    salaryCalculator.addActionListener(e -> Salary.calculate());

    JButton volumeCalculator = new JButton("3D Volume Calculator");
    volumeCalculator.setBounds(50,100,95,30);
    volumeCalculator.addActionListener(e -> VolumeMenu.Main());

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
    panel.setLayout(new GridLayout(0, 1));
    panel.add(simpleCalculator);
    panel.add(salaryCalculator);
    panel.add(volumeCalculator);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");
    frame.pack();
    frame.setVisible(true);
  }
}
