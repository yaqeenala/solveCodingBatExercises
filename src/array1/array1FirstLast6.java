package array1;
import java.util.ArrayList;
public class array1FirstLast6 {
    public static boolean firstLast6(int[] nums) {
        int i = nums.length -1;
        if (nums.length >= 1 && ((nums[0] == 6) || (nums[i] == 6))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 8, 16, 6};
        System.out.println(firstLast6(nums));

    }
}
