//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Warmup {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        }
        return false;
    }

    public static int sumDouble(int a, int b) {
        int sum = 0;
        if (a != b) {
            sum = a + b;
        } else if (a == b) {
            sum = 2 * (a + b);
        }
        return sum;
    }

    public static boolean makes10(int a, int b) {
        int c = a + b;
        if (a == 10 || b == 10 || c == 10){
            return true;
        }
        return false;
    }

    public static boolean nearHundred(int n) {
        if ((90 <= n && n <= 110) || (190 <= n && n <= 210)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(sumDouble(5, 5));
        System.out.println(makes10(5, 5));
        System.out.println(nearHundred(150));
    }
}