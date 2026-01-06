import java.util.HashMap;
import java.util.HashSet;

public class containDuplicate {
    class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int n= nums.length;
        // HashSet<Integer> set=new HashSet<>();
        // int i=0,j=0;
        // while(j<n){
        //     //step-1
        //     if(Math.abs(i-j)>k){
        //         set.remove(nums[i]);
        //         i++;
        //     }
        //     if(set.contains(nums[j])){
        //         return true;
        //     }
        //     set.add(nums[j]);
        //     j++;
        // }
        // return false;

        //Using HashMap
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                int pastIndex=map.get(nums[i]);
                if(Math.abs(pastIndex-i)<=k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
}
