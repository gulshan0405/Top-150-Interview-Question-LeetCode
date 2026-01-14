public class HappyNumber {
    class Solution {
     public boolean isHappy(int n) {
        //  HashSet<Integer>set=new HashSet<>();
        // int isOne = n;
        // while (isOne != 1) {
        //     int curr = isOne;
        //     int sq = 0;
        //     while (curr != 0) {
        //         int rem = curr % 10;
        //         sq += (int) Math.pow(rem, 2);
        //         curr /= 10;
        //     }
        //     if (set.contains(sq)) {
        //         return false;
        //     }else{
        //          set.add(sq);
        //     }
        //     isOne = sq;
        // }
        // return true;
          int slow=n;
         int fast=n;
         do{
           slow=findSquare(slow);
           fast=findSquare(findSquare(fast));
         }while(slow!=fast);
         if(slow==1){
            return true;
         }else{
            return false;
         }
        }
        private int findSquare(int num){
            int ans=0;
            while(num>0){
              int rem=num%10;
              ans+=rem*rem;
              num/=10;
            }
          return ans;
}
 
        }

}
