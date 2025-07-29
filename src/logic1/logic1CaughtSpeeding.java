package logic1;

public class logic1CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        if (!isBirthday) {
            if (speed <= 60) {
                ticket = 0;
            } else if (61 <= speed && speed <= 80){
                ticket = 1;
            } else if (speed >= 81) {
                ticket = 2;
            }
        } else if (isBirthday) {
            if (speed <= 65) {
                ticket = 0;
            } else if (66 <= speed && speed <= 85){
                ticket = 1;
            } else if (speed >= 86) {
                ticket = 2;
            }
        }
        return ticket;
    }
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(85, false));
        System.out.println(caughtSpeeding(60, true));
        System.out.println(caughtSpeeding(85, true));



    }
}
