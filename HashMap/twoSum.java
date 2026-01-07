import java.util.HashMap;

public class twoSum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        //     int n=nums.length;
        //     int i;
        //     int j;
        //    for (i=0;i<n;i++){
        //     for(j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int []{i,j};
        //         }
        //     }
        //    }
        //    return new int[]{-1,-1};

        // int n = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.put(nums[i],i);
        // }
        // for (int i = 0; i < n; i++) {
        //     int guess=target-nums[i];
        //     if (map.containsKey(guess)&& map.get(guess) != i) {
        //       return new int[]{i,map.get(guess)};
        //     }
        // }
        // return new int[]{-1,-1};

           HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int guess = target - nums[i];
            if (map.containsKey(guess)) {
                return new int[]{map.get(guess), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
}
