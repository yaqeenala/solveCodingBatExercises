package logic1;

public class logic1SquirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (60 <= temp && temp <= 100) {
                return true;
            }
        } else if (!isSummer) {
            if (60 <= temp && temp <= 90) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(110, false));
        System.out.println(squirrelPlay(70, true));
        System.out.println(squirrelPlay(50, true));




    }
}
