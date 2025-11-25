public class jumpGameII {
    public static void main(String[] args) {
        int []a={2,3,1,1,4};
        System.out.println(jump(a));
    }
      static public int jump(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
       int jump=0;
       int l=0;
       int r=0;
       while(r<n-1){
        int far=0;
        for(int i=l;i<=r;i++){
            far=Math.max(i+nums[i],far);
        }
        jump++;
        l=r+1;
        r=far;
       }
       return jump;
    }
}
