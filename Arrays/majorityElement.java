public class majorityElement {
    public int majority_Element(int[] nums) {
     int majority = nums[0];
        int count = 1;
        for (int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                majority=nums[i];
            }else if (majority==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}
