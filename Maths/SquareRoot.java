

public class SquareRoot {
    public int mySqrt(int x) {
        //optimal approach
        //     if (x == 0 || x == 1) return x;

        // int left = 1, right = x / 2, ans = 0;
        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     long sq = (long) mid * mid; // use long to avoid overflow

        //     if (sq == x) {
        //         return mid;
        //     } else if (sq < x) {
        //         ans = mid; // possible answer
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }
        // return ans;

        //brute force
        long n = Integer.MAX_VALUE;
        long ans=0;
        for (long i = 1; i < n; i++) {
            if (i * i > x) {
                ans=i-1;
                break;
            }
        }
        return (int)ans;
    }
}
