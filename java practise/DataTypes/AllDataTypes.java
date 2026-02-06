import java.util.Scanner;

public class AllDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte myByte = sc.nextByte();

        System.out.print("Enter a short value: ");
        short myShort = sc.nextShort();

        System.out.print("Enter an int value: ");
        int myInt = sc.nextInt();

        System.out.print("Enter a long value: ");
        long myLong = sc.nextLong();

        System.out.print("Enter a float value: ");
        float myFloat = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double myDouble = sc.nextDouble();

        System.out.print("Enter a character: ");
        char myChar = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean myBoolean = sc.nextBoolean();

        sc.nextLine();

        System.out.print("Enter a string: ");
        String myString = sc.nextLine();

        System.out.println("\n--- Entered Values ---");
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);

        sc.close();
    }
}

