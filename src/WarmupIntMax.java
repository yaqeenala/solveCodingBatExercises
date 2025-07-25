public class WarmupIntMax {
    public static int intMax(int a, int b, int c) {
        int d = Math.max(b, c);
        return Math.max(a, d);
    }
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(10, 4, 3));
        System.out.println(intMax(11, 1, 0));
        System.out.println(intMax(1, 2, 2));

    }
}
