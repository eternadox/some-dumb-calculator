package systems;

import java.util.Scanner;

public class volume {
    static Scanner input = new Scanner(System.in);

    public static void cube () {
        System.out.println("Enter your side length: ");
        double sideLen = input.nextDouble();

        System.out.println("Your answer is: " + Math.pow(sideLen, 3));

    }

    public static void triangularPyramid () {
        System.out.println("Enter your base side length: ");
        double baseLen = input.nextDouble();
        System.out.println("Enter your base height: ");
        double baseHeight = input.nextDouble();
        double baseArea = baseLen * baseHeight / 2;

        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Your answer is: " + baseArea * height / 3);

    }

    public static void squarePyramid () {
        System.out.println("Enter your base side length: ");
        double baseLen = input.nextDouble();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Your answer is: " + Math.pow(baseLen, 2) * height / 3);

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

}
