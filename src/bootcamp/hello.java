package bootcamp;

public class hello {
    public static void printArrays(int[] oneDarray, int[][] twoDarray) {
        for (int i = 0; i < oneDarray.length; i++) {
            System.out.print(oneDarray[i] + " ");
        }
        System.out.println();

        //enhanced for loop
        for (int x : oneDarray)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < twoDarray.length; i++) {
            for (int j = 0; j < twoDarray[i].length; j++) {
                System.out.print(twoDarray[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] x : twoDarray) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 1. Basic Data Types
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L;

        float floatVar = 3.14f;
        double doubleVar = 3.141592653589793;

        char charVar = 'A';
        boolean booleanVar = true;

        // Print basic data types
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);

        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);

        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);

        // 2. Type Conversion (Casting)
        int intFromByte = byteVar;  // Widening (Automatic)
        byte byteFromInt = (byte) intVar;  // Narrowing (Explicit)

        System.out.println("\nType Conversion:");
        System.out.println("intFromByte: " + intFromByte);
        System.out.println("byteFromInt: " + byteFromInt);  // Possible data loss due to narrowing

        double doubleFromInt = intVar;  // Widening (Automatic)
        int intFromDouble = (int) doubleVar;  // Narrowing (Explicit)

        System.out.println("doubleFromInt: " + doubleFromInt);
        System.out.println("intFromDouble: " + intFromDouble);  // Fractional part lost

        // 3. 1D Array
        int[] oneDArray = {10, 20, 30, 40, 50};

        // 4. 2D Array
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArrays(oneDArray, twoDArray);

        // Math.min() and Math.max()
        int a = 10;
        int b = 20;
        System.out.println("Min of " + a + " and " + b + " is: " + Math.min(a, b));
        System.out.println("Max of " + a + " and " + b + " is: " + Math.max(a, b));

        // Math.sqrt()
        double num = 16.0;
        System.out.println("Square root of " + num + " is: " + Math.sqrt(num));

        // Math.pow()
        double base = 2.0;
        double exponent = 3.0;
        System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));

        // Math.abs()
        int negativeNum = -10;
        System.out.println("Absolute value of " + negativeNum + " is: " + Math.abs(negativeNum));

        // Math.random()
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generate a random integer between 1 and 100
        int randomInt = (int) (Math.random() * 100) + 1;
        System.out.println("Random integer between 1 and 100: " + randomInt);

        // Math.floor()
        double floorValue = Math.floor(2.9);
        System.out.println("Floor value of 2.9 is: " + floorValue);

        // Math.ceil()
        double ceilValue = Math.ceil(2.1);
        System.out.println("Ceiling value of 2.1 is: " + ceilValue);

        // Math.round()
        double roundValue = Math.round(2.5);
        System.out.println("Rounded value of 2.5 is: " + roundValue);
    }
}
