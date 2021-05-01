package systems;

import java.util.Scanner;

public class Volume {
    static Scanner input = new Scanner(System.in);

    public static void cube () {
        System.out.println("Enter your side length: ");
        double sideLen = input.nextDouble();

        System.out.println("Your answer is: " + Math.pow(sideLen, 3));

    }

    public static void polygonalPyramid () {
        System.out.println("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.println("Enter your base length: ");
        double baseLen = input.nextDouble();
        double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Your answer is: " + height * triangleArea / 3);

    }

    public static void polygonalPrism () {
        System.out.println("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.println("Enter your base length: ");
        double baseLen = input.nextDouble();
        double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Your answer is: " + height * triangleArea);

    }

    public static void cone () {
        System.out.println(" ");

    }

    public static void sphere () {
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.println("Would you like the answer in terms of PI? (y/n)");
        String pi = input.next();

        switch (pi) {
            case "y": System.out.println("Your answer is: " + ((Math.pow(radius, 3) * 4) / 3) + "pi"); break;
            case "n": System.out.println("Your answer is: " + (Math.pow(radius, 3) * 4 * Math.PI) / 3); break;
        }

    }

}
