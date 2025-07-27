package array1;

public class array1SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        int i = nums.length -1;
        if (nums.length >= 1 && (nums[0] == nums[i])) {
            return true;
        }
        return false;
    }
    public static void main(String[] ars) {
        int[] nums = {1, 2, 3, 2, 1};
        System.out.println(sameFirstLast(nums));
    }
}
