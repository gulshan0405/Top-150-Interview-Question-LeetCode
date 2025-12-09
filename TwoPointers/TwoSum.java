public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        //brute force
    //     int n=numbers.length;
    //    for (int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         if((numbers[i]+numbers[j])==target){
    //            return new int[]{i+1,j+1};
    //         }
    //     }
    //    }
    //    return new int []{-1,-1};

    //better solution using hashmaps
    //  int n=numbers.length;
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<n;i++){
    //         int a=numbers[i];
    //         int more=target-a;
    //         if(map.containsKey(more)){
    //             return new int[]{map.get(more)+1,i+1};
    //         }
    //         map.put(a, i);
    //     }
    //     return new int[] {-1,-1};

    //optimal approach
     int n=numbers.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
 
    }
}
