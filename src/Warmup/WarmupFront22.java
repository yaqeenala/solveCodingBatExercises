public class WarmupFront22 {
    public static String front22(String str) {
        String firstTowChar = null;
        if(str.length() >= 2) {
            firstTowChar = str.substring(0, 2);
        } else if (str.length() == 1) {
            firstTowChar = str;
        } else {
            firstTowChar = "";
        }
        return firstTowChar + str + firstTowChar;
    }

    public static void main(String args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("ab"));
        System.out.println(front22("aaa"));
        System.out.println(front22(""));

    }
}
