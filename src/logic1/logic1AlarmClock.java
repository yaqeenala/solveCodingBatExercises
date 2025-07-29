package logic1;

public class logic1AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        String alarmTiming = null;
        if (!vacation) {
            if (day == 6 || day == 0) {
                alarmTiming = "10:00";
            } else if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
                alarmTiming = "7:00";
            }
        } else if (vacation) {
            if (day == 6 || day == 0) {
                alarmTiming = "off";
            } else if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
                alarmTiming = "10:00";
            }
        }
        return alarmTiming;
    }
    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(0, false));
        System.out.println(alarmClock(1, true));
        System.out.println(alarmClock(0, true));



    }

}
