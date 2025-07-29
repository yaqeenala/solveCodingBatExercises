package logic1;

public class logic1CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
        } else if (!isWeekend) {
            if (40 <= cigars && cigars <= 60) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));

    }
}
