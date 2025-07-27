package array1;

public class array1BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = a[0] + a[1];
        int sum2 = b[0] + b[1];
        if (sum1 > sum2) {
            return a;
        } else if (sum2 > sum1) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(biggerTwo(a, b));
    }
}
