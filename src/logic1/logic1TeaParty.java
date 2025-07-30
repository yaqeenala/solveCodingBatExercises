package logic1;

public class logic1TeaParty {
    public static int teaParty(int tea, int candy) {
        int rating = 0;
        if (tea < 5 || candy < 5) {
            rating = 0;
        }  else if (tea >= (candy * 2) || candy >= ( tea * 2)) {
            rating = 2;
        } else if (tea >= 5 && candy >= 5) {
            rating = 1;
        }
        return rating;
    }
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(16, 8));

    }
}
