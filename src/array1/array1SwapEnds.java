package array1;

public class array1SwapEnds {
    public static int[] swapEnds(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        if (nums.length >= 1) {
            int i = nums[0];
            int j = nums[nums.length -1];
            newArray[0] = j;
            newArray[newArray.length - 1] = i;
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(swapEnds(nums));
    }
}
