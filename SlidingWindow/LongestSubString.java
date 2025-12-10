import java.util.Arrays;

public class LongestSubString {
     public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];  
        Arrays.fill(last, -1);      

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If character was seen inside current window, move left
            if (last[ch] >= left) {
                left = last[ch] + 1;
            }

            // Update last seen index
            last[ch] = right;

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
