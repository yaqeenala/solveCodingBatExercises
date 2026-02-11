package array1;

public class array1Has23 {
    public static boolean has23(int[] nums) {
        for(int i = 0; i <= 1; i ++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(has23(nums));
    }
}
