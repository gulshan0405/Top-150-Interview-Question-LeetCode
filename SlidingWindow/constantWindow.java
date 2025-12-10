

public class constantWindow {
      public static void main(String[] args) {
       int []arr={-1,2,3,3,4,5,-1};
       int ans=ConstantWindow(arr, 4);
       System.out.println(ans);
    }
   static public int ConstantWindow(int []nums,int k){
     int l=0;
     int r=k-1;
     int n=nums.length;
     int maxSum=0;
     while(r<n){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=nums[i];
        }
        maxSum=Math.max(maxSum, sum);
        l++;
        r++;
     }
     return maxSum;
   } 
}
