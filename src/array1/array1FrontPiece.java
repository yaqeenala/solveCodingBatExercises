package array1;

public class array1FrontPiece {
    public static int[] frontPiece(int[] nums) {
        int a = 0;
        int b = 0;
        int[] newArray = null;
        if (nums.length == 0) {
            newArray = new int[0];
        } else if (nums.length == 1) {
            a = nums[0];
            newArray = new int[]{a};
        } else if (nums.length >= 2) {
            a = nums[0];
            b = nums[1];
            newArray = new int[]{a, b};
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(frontPiece(nums));
    }
}
