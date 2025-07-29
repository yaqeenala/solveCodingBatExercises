package logic1;

public class logic1DateFashion {
    public static int dateFashion(int you, int date) {
        int gettingTable = 0;
        if (you <= 2 || date <= 2) {
            gettingTable = 0;
        } else if (you >= 8 || date >= 8) {
            gettingTable = 2;
        } else {
            gettingTable = 1;
        }
        return gettingTable;
    }
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 5));
        System.out.println(dateFashion(10, 10));
        System.out.println(dateFashion(1, 1));




    }

}
