package systems;

import event.Exceptions;

import java.util.Scanner;
import java.text.*;
import java.util.Locale;

public class Salary {

    public static double yearlySalary (double hoursPerDayFunc, double incomePerHourFunc, int vacationDaysFunc)
    {
        double salary = (hoursPerDayFunc * incomePerHourFunc) * 365;
        double vacation = (vacationDaysFunc * incomePerHourFunc * 8);

        return salary - vacation;
    }

    public static void calculate() {
        // currency type declaration
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat jn = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("How many hours do you work in a week?"); double hoursPerWeek = input.nextInt();

            while (hoursPerWeek <= 0 || hoursPerWeek > 168)
            {
                System.out.println("Value must be more than 0 and less than 168..."); hoursPerWeek = input.nextInt();
            }
            double hoursPerDay = hoursPerWeek / 7;

            System.out.println("How much do you make per hour?"); double incomePerHour = input.nextDouble();

            while (incomePerHour <= 0)
            {
                System.out.println("Value must be more than 0..."); incomePerHour = input.nextDouble();
            }

            System.out.println("How many days of vacation do you take?"); int vacationDays = input.nextInt();

            while (vacationDays < 0 || vacationDays > 365)
            {
                System.out.println("Value must not be less than 0 or more than 365..."); vacationDays = input.nextInt();
            }

            double salary = yearlySalary(hoursPerDay, incomePerHour, vacationDays);

            System.out.println("Which type of currency would you like?\n\n" +
                    "1. USD\n" +
                    "2. Rupee\n" +
                    "3. Renminbi\n" +
                    "4. Euro\n" +
                    "5. Yen\n");
            int currencyOption = input.nextInt();

            switch (currencyOption) {
                case 1: System.out.println("Your salary is: " + (us.format(salary))); break;
                case 2: System.out.println("Your salary is: " + (in.format(salary))); break;
                case 3: System.out.println("Your salary is: " + (cn.format(salary))); break;
                case 4: System.out.println("Your salary is: " + (fr.format(salary))); break;
                case 5: System.out.println("Your salary is: " + (jn.format(salary))); break;
                default: System.out.println("Invalid Input!");
            }

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
        }
    }
}
