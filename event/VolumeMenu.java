package event;

import java.util.Scanner;
import systems.Volume;

public class VolumeMenu {
    public static void Main () {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to calculate the volume of?\n\n" +
                "1. Cube\n" +
                "2. Polygonal Pyramid\n" +
                "3. Cone\n" +
                "4. Polygonal Prism\n" +
                "5. Cylinder\n" +
                "6. Sphere\n" +
                "7. Torus\n" +
                "8. Ellipsoid");

        try {
            int option = input.nextInt();

            switch (option) {
                case 1: Volume.cube(); break;
                case 2: Volume.polygonalPyramid(); break;
                case 3: Volume.cone(); break;
                case 4: Volume.polygonalPrism(); break;
                case 5: Volume.cylinder(); break;
                case 6: Volume.sphere(); break;
                case 7: Volume.torus(); break;
                case 8: Volume.ellipsoid(); break;
                default: System.out.println("Invalid Input!");
            }

        } catch (NumberFormatException nfe) {
         Exceptions.numFormatException(nfe);
        }
    }
}