

public class plusOne {
     public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // if digit < 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // digit is 9 → becomes 0, carry continues
            digits[i] = 0;
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
