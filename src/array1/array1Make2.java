package array1;

public class array1Make2 {
    public static int[] make2(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        if (a.length == 0) {
            i = b[0];
            j = b[1];
        } else if (a.length == 1) {
            i = a[0];
            j = b[0];
        } else if (a.length >= 2) {
            i = a[0];
            j = a[1];
        }
        int[] newArray = new int[]{i, j};
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1, 2, 3};
        System.out.println(make2(a, b));
    }
}
