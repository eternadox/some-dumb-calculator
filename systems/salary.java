package systems;

import java.util.Scanner;
import java.text.*;
import java.util.Locale;

public class salary {

    public static double yearlySalary (double hoursPerDayFunc, double incomePerHourFunc, int vacationDaysFunc)
    {
        double salary = (hoursPerDayFunc * incomePerHourFunc) * 365;
        double vacation = (vacationDaysFunc * incomePerHourFunc * 8);

        return salary - vacation;
    }

    public static void calculate() {

        Scanner input = new Scanner(System.in);

        System.out.println("How many hours do you work in a week?");

        double hoursPerWeek = input.nextInt();
        while (hoursPerWeek <= 0 || hoursPerWeek > 168)
        {
            System.out.println("Value must be more than 0 and less than 168...");
            hoursPerWeek = input.nextInt();
        }
        double hoursPerDay = hoursPerWeek / 7;

        System.out.println("How much do you make per hour?");

        double incomePerHour = input.nextDouble();
        while (incomePerHour <= 0)
        {
            System.out.println("Value must be more than 0...");
            incomePerHour = input.nextDouble();
        }

        System.out.println("How many days of vacation do you take?");

        int vacationDays = input.nextInt();
        while (vacationDays < 0 || vacationDays > 365)
        {
            System.out.println("Value must not be less than 0 or more than 365...");
            vacationDays = input.nextInt();
        }

        double salary = yearlySalary(hoursPerDay, incomePerHour, vacationDays);

        System.out.println("Which type of currency would you like?\n\n" +
                "1. USD\n" +
                "2. Rupee\n" +
                "3. Renminbi\n" +
                "4. Euro\n" +
                "5. Yen\n");

        int currencyOption = input.nextInt();
        if (currencyOption == 1) {
            NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("Your salary is: " + (us.format(salary)));

        } else if (currencyOption == 2) {
            NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
            System.out.println("Your salary is: " + (in.format(salary)));
        } else if (currencyOption == 3) {
            NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println("Your salary is: " + (cn.format(salary)));
        } else if (currencyOption == 4) {
            NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("Your salary is: " + (fr.format(salary)));
        } else if (currencyOption == 5) {
            NumberFormat jn = NumberFormat.getCurrencyInstance(Locale.JAPAN);
            System.out.println("Your salary is: " + (jn.format(salary)));
        }

    }

}
