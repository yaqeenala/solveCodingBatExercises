package array1;

    public class array1CommonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        int i = a.length - 1;
        int j = b.length - 1;
        if (a.length >= 1 && b.length >= 1 && (a[0] == b[0]) || (a[i] == b[j])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4};
        System.out.println(commonEnd(a, b));
    }

}
