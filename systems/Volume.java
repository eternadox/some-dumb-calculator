package systems;

import java.util.Scanner;
import event.Exceptions;

public class Volume {
    static Scanner input = new Scanner(System.in);

    public static void cube () {
        try {
            System.out.println("Enter your side length: "); double sideLen = input.nextDouble();
            System.out.println("Your answer is: " + Math.pow(sideLen, 3));

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.cube();

        }
    }

    public static void polygonalPyramid () {
        try {
            System.out.println("Enter the number of sides: "); int sides = input.nextInt();
            System.out.println("Enter your base length: "); double baseLen = input.nextDouble();
            double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
            System.out.println("Enter your height: "); double height = input.nextDouble();

            System.out.println("Your answer is: " + height * triangleArea / 3);

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.polygonalPyramid();
        }
    }

    public static void cone () {
        try {
            System.out.println("Enter your radius: "); double radius = input.nextDouble();
            System.out.println("Enter your height: "); double height = input.nextDouble();

            System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();

            switch (pi) {
                case "y": System.out.println("Your answer is: " + (Math.pow(radius, 2) * height / 3) + "pi"); break;
                case "n": System.out.println("Your answer is: " + ((Math.pow(radius, 2) * Math.PI) * height / 3)); break;

            }
        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.cone();
        }
    }

    public static void polygonalPrism () {
        try {
            System.out.println("Enter the number of sides: "); int sides = input.nextInt();
            System.out.println("Enter your base length: "); double baseLen = input.nextDouble();
            double triangleArea = (sides * Math.pow(baseLen, 2) / (4 * Math.tan(Math.PI/sides)));
            System.out.println("Enter your height: "); double height = input.nextDouble();

            System.out.println("Your answer is: " + height * triangleArea);

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.polygonalPrism();
        }
    }

    public static void cylinder () {
        try {
            System.out.println("Enter your radius: "); double radius = input.nextDouble();
            System.out.println("Enter your height: "); double height = input.nextDouble();

            System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();

            switch (pi) {
                case "y": System.out.println("Your answer is: " + Math.pow(radius, 2) * height + "pi"); break;
                case "n": System.out.println("Your answer is: " + (Math.pow(radius, 2) * Math.PI) * height); break;
            }

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.cylinder();
        }
    }

    public static void sphere () {
        try {
            System.out.println("Enter the radius: "); double radius = input.nextDouble();

            System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();
            switch (pi) {
                case "y": System.out.println("Your answer is: " + ((Math.pow(radius, 3) * 4) / 3) + "pi"); break;
                case "n": System.out.println("Your answer is: " + (Math.pow(radius, 3) * 4 * Math.PI) / 3); break;
            }

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.sphere();
        }
    }

    public static void torus () {
        try {
            System.out.println("Enter your major radius: "); double majorRadius = input.nextDouble();
            System.out.println("Enter your minor radius: "); double minorRadius = input.nextDouble();

            System.out.println("Would you like the answer in terms of PI? (y/n)"); String pi = input.next();
            switch (pi) {
                case "y": System.out.println("Your answer is: " + ((Math.pow(minorRadius, 2)) * (2 * majorRadius)) + "pi"); break;
                case "n": System.out.println("Your answer is: " + (Math.PI * Math.pow(minorRadius, 2)) * (Math.PI * 2 * majorRadius)); break;
            }

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.torus();
        }
    }

    public static void ellipsoid () {
        try {
            System.out.println("Enter your A axis: "); double axisA = input.nextDouble();
            System.out.println("Enter your B axis: "); double axisB = input.nextDouble();
            System.out.println("Enter your C axis: "); double axisC = input.nextDouble();

            System.out.println("Would you like the answer in terms of Pi? (y/n)"); String pi = input.next();
            switch (pi) {
                case "y": System.out.println("Your answer is: " + ((4.0 / 3.0) * (axisA * axisB * axisC)) + "pi"); break;
                case "n": System.out.println("Your answer is: " + (4.0 / 3.0) * (Math.PI * axisA * axisB * axisC)); break;
            }

        } catch (NumberFormatException nfe) {
            Exceptions.numFormatException(nfe);
            Volume.ellipsoid();
        }
    }
}