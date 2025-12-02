import java.util.HashMap;

public class twoSum {
    
    static public int[] twoSumbrute(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("nums[i]=" + numbers[i]);
                System.out.println("nums[j]=" + numbers[j]);
                System.out.println("addition above element is = " + (numbers[i] + numbers[j]));
                if ((numbers[i] + numbers[j]) == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }
        }
        return new int[] { -1, -1 };
    }
    //better
     static public int[] twoSumbetter(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=numbers[i];
            int more=target-a;
            if(map.containsKey(more)){
                return new int[]{map.get(more),i};
            }
            map.put(a, i);
        }
        return new int[] {-1,-1};
     }
    //  optimal
    static public int[] twoSumbetterop(int[] numbers, int target) {
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
