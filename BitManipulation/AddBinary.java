

public class AddBinary {
     public String addBinary(String a, String b) {
  int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuilder ans = new StringBuilder();

    while (i >= 0 || j >= 0 || carry == 1) {
        int sum = carry;

        if (i >= 0) sum += a.charAt(i--) - '0';
        if (j >= 0) sum += b.charAt(j--) - '0';

        ans.append(sum % 2);   // write the current bit
        carry = sum / 2;       // update carry
    }

    return ans.reverse().toString();
    }
}
