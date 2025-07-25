public class WarmupIn3050 {
    public static boolean in3050(int a, int b) {
        if ((30 <= a && a <= 40) && (30 <= b && b <= 40)) {
            return true;
        } else if ((40 <= a && a <= 50) && (40 <= b && b <= 50)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(in3050(35, 40));
        System.out.println(in3050(35, 50));
        System.out.println(in3050(55, 44));

        System.out.println(in3050(90, 100));

    }
}
