package event;

import java.util.Scanner;
import systems.Volume;

public class VolumeMenu {
    public static void Main () {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to calculate the volume of?\n\n" +
                "1. Cube\n" +
                "2. Polygonal Pyramid\n" +
                "3. Polygonal Prism\n" +
                "4. Sphere");
        int option = input.nextInt();

        switch (option) {
            case 1: Volume.cube(); break;
            case 2: Volume.polygonalPyramid(); break;
            case 4: Volume.polygonalPrism(); break;
            case 5: Volume.sphere(); break;
            default: System.out.println("Invalid Input!");
        }

    }

}
