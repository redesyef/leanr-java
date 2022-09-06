import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        String[] androidVersions = new String[22]; //?<- String[limitante]
        String days[] = new String[7];

        /**
         * +----------------+
         * | Country | City |
         * ------------------
         * | Colombia | bog |
         * | Colombia | bog |
         * | Colombia | bog |
         * | Colombia | bog |
         * +----------------+
         */
        String[][] cities = new String[4][2]; //? 4 * 2 = 8 elements
        String[][] matrix = new String[4][4]; //? 4 * 4 = 16 elements


        String[][][] matrix3D = new String[4][4][4];
        String[][][][] matrix4D = new String[4][4][4][4];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana pie";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        printArray(androidVersions);


        cities[0][0] = "Colombia";
        cities[0][1] = "Bogota";
        cities[1][0] = "Colombia";
        cities[1][1] = "Medellin";
        cities[2][0] = "Mexico";
        cities[2][1] = "CDMX";

        printArray2d(cities);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printArray2d(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    /**
     * aca hay una forma de no depender del
     * @tamaño | @limitante del Array.
     * */
    public class ArraysTest {
        public static void main(String[] args) {
            List<String> Days = new ArrayList<>();
            Days.add("Monday");
            Days.add("Tuesday");

            Days.forEach((n) -> System.out.println(n));
        }
    }

    /**
     * @pila -> Array de una sola dimension
     */
};