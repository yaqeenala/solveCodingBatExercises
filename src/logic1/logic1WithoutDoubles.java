package logic1;

public class logic1WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = 0;
        if (!noDoubles) {
            sum = die1 + die2;
        }
        if (noDoubles) {
            if (die1 == die2) {
                if (die1 == 6) {
                    sum = 6 + 1;
                } else {
                    sum = die1 + die2 + 1;
                }
            } else {
                sum = die1 + die2;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(6, 6, true));
        System.out.println(withoutDoubles(3, 3, false));


    }
}
