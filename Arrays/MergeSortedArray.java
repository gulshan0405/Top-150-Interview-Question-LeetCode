// package Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int []a={1,2,3,0,0,0};
        int []b={2,5,6};
        int m=3;
        int n=3;
        merge(a, m, b, n);
        mergeOptimal(a, m, b, n);
        System.out.println(java.util.Arrays.toString(a));
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n){
      int []merge=new int[m+n];
      int size1=0;
      int size2=0;
      int i=0;
      while(size1<m && size2<n){
        if(nums1[size1]<=nums2[size2]){
          merge[i++]=nums1[size1++];
        }else{
          merge[i++]=nums2[size2++];
        }
      }
      while(size1<m){
        merge[i++]=nums1[size1++];
      }  
      while(size2<n){
        merge[i++]=nums2[size2++];
      for(int j=0;j<m+n;j++){
        nums1[j]=merge[j];
      }
      }
    }
     public static void mergeOptimal(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // Last valid element in nums1
        int j = n - 1;          // Last element in nums2
        int k = m + n - 1;      // Last index of nums1

        // Compare from the back and place the larger one at the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
