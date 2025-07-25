public class WarmupHasTeen {
    public static boolean hasTeen(int a, int b, int c) {
        if ((13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(10, 20, 19));
        System.out.println(hasTeen(13, 20, 13));
        System.out.println(hasTeen(12, 20, 1));
        System.out.println(hasTeen(13, 13, 13));




    }
}
