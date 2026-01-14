import java.util.HashMap;

public class anagram {
    class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) return false;

        // int[] count = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }

        // for (int c : count) {
        //     if (c != 0) return false;
        // }

        // return true;

        // if(s.length()!=t.length()){
        //     return false;
        // }
        // int []arr=new int[s.length()];
        // int []brr=new int[t.length()];
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     char sh=t.charAt(i);
        //     arr[i]=ch+1;
        //     brr[i]=sh+1;
        // }
        // Arrays.sort(arr);
        // Arrays.sort(brr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=brr[i]){
        //        return false;
        //     }
        // }
        // return true;
      
        if (s.length() != t.length()) {
        return false;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    // count frequency from string s
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // reduce frequency using string t
    for (char c : t.toCharArray()) {
        if (!map.containsKey(c)) {
            return false; // char not found
        }
        map.put(c, map.get(c) - 1);

        if (map.get(c) == 0) {
            map.remove(c); // clean up
        }
    }

    // if map is empty, it's an anagram
    return map.isEmpty();
    }
}
}
