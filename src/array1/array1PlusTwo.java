package array1;

public class array1PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        int i = a[0];
        int j = a[1];
        int n = b[0];
        int m = b[1];
        int[] newArray = {i, j, n, m};
        return newArray;
    }
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(plusTwo(a, b));
    }
}
