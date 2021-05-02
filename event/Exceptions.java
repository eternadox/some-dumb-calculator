package event;

public class Exceptions {

    public static void numFormatException (NumberFormatException nfe) {
        System.out.println("NumberFormatException: " + nfe.getMessage() + "\nAre you sure you are using a number?");
    }

}
