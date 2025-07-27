package array1;

public class array1RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int[] rotatedList = {b, c, a};
        return rotatedList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(rotateLeft3(nums));
    }
}
