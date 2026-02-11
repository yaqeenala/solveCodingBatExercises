package array1;

public class array1MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] newArray = null;
        if (nums.length >= 1) {
            int i = nums.length;
            int newArrayLength = i * 2;
            newArray = new int[newArrayLength];
            int j = nums[nums.length - 1];
            newArray[newArray.length - 1] = j;

        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(makeLast(nums));
    }
}
