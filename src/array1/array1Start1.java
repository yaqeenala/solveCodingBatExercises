package array1;

public class array1Start1 {

    public static int start1(int[] a, int[] b) {
        int counter = 0;

        if (a.length >= 1 && a[0] == 1) {
            counter++;
        }

        if (b.length >= 1 && b[0] == 1) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4};

        System.out.println(start1(a, b));
    }
}
