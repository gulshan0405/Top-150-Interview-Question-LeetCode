
public class RotateImage {
   class Solution {
    public void rotate(int[][] matrix) {
        // int n=matrix.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }
        // for(int []arr:matrix){
        //     int i=0;
        //     int j=arr.length-1;
        //     while(i<=j){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //         i++;
        //         j--;
        //     }
        // }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] contain = new int[m * n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                contain[k] = matrix[i][j];
                k++;
            }
        }
        k = 0;
        int[][] rotatedMat = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                rotatedMat[j][i] = contain[k];
                k++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotatedMat[i][j];
            }
        }
    }
}
}
