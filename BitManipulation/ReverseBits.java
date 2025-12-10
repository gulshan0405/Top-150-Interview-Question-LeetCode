public class ReverseBits {
      public int reverseBits(int n) {
        // String s = "";
        // while (n != 0) {
        //     int rem = n % 2;
        //     s += rem;
        //     n /= 2;
        // }
        // int len = s.length();
        // int zero = 32 - len;
        // int x = 0;
        // while (x < zero) {
        //     s += '0';
        //     x++;
        // }
        // len = s.length();
        // char[] arr = s.toCharArray();
        // int ans = 0;
        // int Pow = 0;
        // for (int i = len - 1; i >= 0; i--) {
        //     ans += (arr[i] - '0') * Math.pow(2, Pow);
        //     Pow++;
        // }
        // return ans;

        //optimal solution
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1; // shift result left
            ans |= (n & 1); // add last bit of n
            n >>= 1; // remove last bit from n
        }

        return ans;
    }
}
