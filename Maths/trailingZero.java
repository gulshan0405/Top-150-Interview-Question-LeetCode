package Maths;

public class trailingZero {
    //approach is right but limitation
    public int trailingZeroes(int n) {
        int a = n;
        long fact = n;
        while (a > 1) {
            fact *= a - 1;
            a--;
        }
        int count = 0;
        while (fact != 0) {
            long digit = fact % 10;
            if (digit != 0) {
                break;
            }
            if (digit == 0) {
                count++;
            }
            fact /= 10;
        }
        return count;
    }
    //optimal solution
     public int trailingZeroes2(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}
