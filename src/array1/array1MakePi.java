package array1;
import java.util.Arrays;
public class array1MakePi {
    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    public static void main(String[] args) {
        int[] result = makePi();
        System.out.println(Arrays.toString(result));
    }
}
