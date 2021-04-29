package systems;

import java.util.Scanner;

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

        System.out.println("Your salary is: " + (salary.yearlySalary(hoursPerDay, incomePerHour, vacationDays)));
    }

}
