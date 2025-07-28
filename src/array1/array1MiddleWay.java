package array1;

public class array1MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        int i = a[1];
        int j = b[1];
        int[] newArray = {i , j};
        return newArray;
    }

    public  static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(middleWay(a, b));
    }
}
