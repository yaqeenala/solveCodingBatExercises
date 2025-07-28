package array1;

public class array1Front11 {
    public static int[] front11(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] newArray = null;
        if (a.length == 0 && b.length == 0) {
            newArray = new int[]{};
        } else if (a.length == 0 && b.length >= 1) {
            j = b[0];
            newArray = new int[]{j};
        } else if (a.length >= 1 && b.length == 0) {
            i = a[0];
            newArray = new int[]{i};
        } else if (a.length >= 1 && b.length >= 1) {
            i = a[0];
            j = b[0];
            newArray = new int[]{i, j};
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1, 2, 3};
        System.out.println(front11(a, b));
    }
}
