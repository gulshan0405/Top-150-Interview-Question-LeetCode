public class duplicateElementII {
     public static void main(String[] args) {
        int []nums={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
     static public int removeDuplicates(int[] nums) {
       if (nums.length <= 2) return nums.length;

        int i = 2; // start from index 2 because first two are always valid
        for (int j = 2; j < nums.length; j++) {
            // Compare with the element two places before
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i; // i is the new length
    }
}
