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

    public static boolean posNeg(int a, int b, boolean negative) {
        if ((a < 0 && b > 0 && !negative) || (a > 0 && b < 0 && !negative) || (a < 0 && b < 0 && negative)) {
            return true;
        }
        return false;
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static String missingChar(String str, int n) {
        String front = null;
        String back = null;
        if (str != null && n <= str.length() -1) {
            front = str.substring(0, n);
            back = str.substring(n+1, str.length());
        }
        return front + back;

    }

    public static String frontBack(String str) {
        String firstChar = null;
        String lastChar = null;
        String middleString = null;
        String newWord = null;
        if(str != null && str.length() >= 2) {
            firstChar = str.substring(0, 1);
            int lastIndex = str.length();
            lastChar = str.substring(lastIndex - 1, lastIndex);
            middleString = str.substring(1, str.length() -1);
            newWord = lastChar + middleString + firstChar;
        } else if(str != null && str.length() == 1) {
            newWord =  str;
        } else if (str == "") {
            newWord = "";
        }
        return newWord;
    }

    public static String front3(String str) {
        String newStr = null;
        if (str.length() >= 3) {
            newStr = str.substring(0, 3);
        } else if (str.length() == 2) {
            newStr = str.substring(0, 2);
        } else if (str.length() == 1) {
            newStr = str.substring(0, 1);
        } else if (str.length() == 0) {
            newStr = "";
        }
        return newStr + newStr + newStr;
    }

    public static String backAround(String str) {
        String lastChar = null;
        if (str.length() >= 1) {
            lastChar = str.substring(str.length() - 1, str.length());
        }
        return lastChar + str + lastChar;
    }

    public static boolean or35(int n) {
        if ((n >=0) &&  (n % 3 == 0 || n % 5 == 0)) {
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
        System.out.println(posNeg(-5,-3, true));
        System.out.println(notString("good"));
        System.out.println(notString("not bad"));
        System.out.println(missingChar("now", 2));
        System.out.println(frontBack("Hello"));
        System.out.println(front3("Hello"));
        System.out.println(backAround("Hello"));
        System.out.println(or35(33));

    }
}