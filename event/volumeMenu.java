package event;

import java.util.Scanner;

public class volumeMenu {
    public static void Main () {
        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to calculate the volume of?\n\n" +
                "1. Cube\n" +
                "2. Triangular Pyramid\n" +
                "3. Square Pyramid\n" +
                "4. Triangular Prism\n" +
                "5. Rectangular Prism");
        int option = input.nextInt();

        switch (option) {
            case 1: volume.cube(); break;
            case 2: volume.triangularPyramid(); break;
            case 3: volume.squarePyramid(); break;
            case 4: volume.triangularPrism(); break;
            case 5: volume.rectangularPrism(); break;
            default: System.out.println("Invalid Input!");
        }

    }

}
