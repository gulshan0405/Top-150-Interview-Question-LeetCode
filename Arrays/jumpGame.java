public class jumpGame {
    public static void main(String[] args) {
        
    }
      public boolean canJump(int[] nums) {
        int maxIndex=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           
            if(maxIndex<i)
                return false;
            
            maxIndex=Math.max(nums[i]+i,maxIndex);
            if(maxIndex>=n-1)
                return true;
        }
        return true;
    }
}
