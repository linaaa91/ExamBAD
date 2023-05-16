//Maulina - 2602171741
import java.util.Arrays;
public class Dua {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 3, 7, 8};
        int[] array2 = {1, 2, 3, 4, 6};

        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}