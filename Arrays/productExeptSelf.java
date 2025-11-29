public class productExeptSelf {
     static public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
            System.out.println("prefix value index (" + i + ")" + prefix[i]);
        }
        sufix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            sufix[i] = sufix[i + 1] * nums[i + 1];
            System.out.println("sufix value index (" + i + ")" + sufix[i]);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * sufix[i];
        }
        return ans;
    }

     static public int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        //prefix=>ans
        ans[0]=1;
        for (int i = 1; i < n; i++) {
          ans[i]=ans[i-1]*nums[i-1];
        }
        //sufix=>ans
         int sufix=1;
        for (int i = n - 2; i >= 0; i--) {
          sufix*=nums[i+1];
          ans[i]*=sufix;
        }
        return ans;
    }
}
