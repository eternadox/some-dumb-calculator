package systems;

import java.util.Scanner;

public class Volume {
    static Scanner input = new Scanner(System.in);

    public static void cube () {
        System.out.println("Enter your side length: "); double sideLen = input.nextDouble();

        System.out.println("Your answer is: " + Math.pow(sideLen, 3));

    }

    public static void polygonalPyramid () {
        System.out.println("Enter the number of sides: "); int sides = input.nextInt();
        System.out.println("Enter your base length: "); double baseLen = input.nextDouble();
        double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
        System.out.println("Enter your height: "); double height = input.nextDouble();

        System.out.println("Your answer is: " + height * triangleArea / 3);

    }

    public static void cone () {
        System.out.println("Enter your radius: "); double radius = input.nextDouble();
        System.out.println("Enter your height: "); double height = input.nextDouble();

        System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();

        switch (pi) {
            case "y": System.out.println("Your answer is: " + (Math.pow(radius, 2) * height / 3) + "pi"); break;
            case "n": System.out.println("Your answer is: " + ((Math.pow(radius, 2) * Math.PI) * height / 3)); break;
        }

    }

    public static void polygonalPrism () {
        System.out.println("Enter the number of sides: "); int sides = input.nextInt();
        System.out.println("Enter your base length: "); double baseLen = input.nextDouble();
        double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
        System.out.println("Enter your height: "); double height = input.nextDouble();

        System.out.println("Your answer is: " + height * triangleArea);

    }

    public static void cylinder () {
        System.out.println("Enter your radius: "); double radius = input.nextDouble();
        System.out.println("Enter your height: "); double height = input.nextDouble();

        System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();

        switch (pi) {
            case "y": System.out.println("Your answer is: " + Math.pow(radius, 2) * height + "pi"); break;
            case "n": System.out.println("Your answer is: " + (Math.pow(radius, 2) * Math.PI) * height); break;
        }

    }

    public static void sphere () {
        System.out.println("Enter the radius: "); double radius = input.nextDouble();

        System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();
        switch (pi) {
            case "y": System.out.println("Your answer is: " + ((Math.pow(radius, 3) * 4) / 3) + "pi"); break;
            case "n": System.out.println("Your answer is: " + (Math.pow(radius, 3) * 4 * Math.PI) / 3); break;
        }

    }

    public static void torus () {
        System.out.println("Enter your major radius: "); double majorRadius = input.nextDouble();
        System.out.println("Enter your minor radius: "); double minorRadius = input.nextDouble();

        System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();
        switch (pi) {
            case "y": System.out.println("Your answer is: " + ((Math.pow(minorRadius, 2)) * (2 * majorRadius)) + "pi"); break;
            case "n": System.out.println("Your answer is: " + (Math.PI * Math.pow(minorRadius, 2)) * (Math.PI * 2 * majorRadius)); break;
        }

    }

    public static void ellipsoid () {
        System.out.println("Enter your A axis: "); double axisA = input.nextDouble();
        System.out.println("Enter your B axis: "); double axisB = input.nextDouble();
        System.out.println("Enter your C axis: "); double axisC = input.nextDouble();

        System.out.println("Would you like the answer in terms of Pi? (y/n)"); String pi = input.next();
        switch (pi) {
            case "y": System.out.println("Your answer is: " + ((4.0 / 3.0) * (axisA * axisB * axisC)) + "pi"); break;
            case "n": System.out.println("Your answer is: " + (4.0 / 3.0) * (Math.PI * axisA * axisB * axisC)); break;
        }
    }
}