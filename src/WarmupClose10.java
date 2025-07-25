public class WarmupClose10 {
    public static int close10(int a, int b) {
        int c = Math.abs(10 - a);
        int d = Math.abs(10 - b);
        if (c < d) {
            return a;
        } else if (d < c) {
            return b;
        }
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(close10(12, 20));
        System.out.println(close10(5, 15));
        System.out.println(close10(4, 10));
        System.out.println(close10(19, 18));

    }
}
