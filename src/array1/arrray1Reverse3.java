package array1;

public class arrray1Reverse3 {
    public static int[] reverse3(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        int[] rotatedList = {c, b, a};
        return rotatedList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(reverse3(nums));
    }
}
