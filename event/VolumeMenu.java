package event;

import java.util.Scanner;
import systems.Volume;

public class VolumeMenu {
    public static void Main () {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to calculate the volume of?\n\n" +
                "1. Cube\n" +
                "2. Triangular Pyramid\n" +
                "3. Square Pyramid\n" +
                "4. Polygonal Prism");
        int option = input.nextInt();

        switch (option) {
            case 1: Volume.cube(); break;
            case 2: Volume.triangularPyramid(); break;
            case 3: Volume.squarePyramid(); break;
            case 4: Volume.polygonalPrism(); break;
            default: System.out.println("Invalid Input!");
        }

    }

}
