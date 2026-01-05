import java.util.HashMap;

public class wordPattern {

    class Solution {
    public boolean wordPattern(String pattern, String s) {
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     String a = "";
        //     while (i < s.length() && s.charAt(i) != ' ') {
        //         a += s.charAt(i);
        //         i++;
        //     }
        //     list1.add(a);
        // }
        // for (int i = 0; i < pattern.length(); i++) {
        //     String b = "";
        //     b += pattern.charAt(i);
        //     list2.add(b);
        // }
        // if (list1.size() != list2.size())
        //     return false;

        // HashMap<String, String> mapST = new HashMap<>();
        // HashMap<String, String> mapTS = new HashMap<>();
        // for (int i = 0; i < pattern.length(); i++) {
        //     String x = list1.get(i);
        //     String y = list2.get(i);

        //     if (mapST.containsKey(x)) {
        //         if (!mapST.get(x).equals(y))
        //             return false;
        //     } else {
        //         mapST.put(x, y);
        //     }

        //     if (mapTS.containsKey(y)) {
        //         if (!mapTS.get(y).equals(x))
        //             return false;
        //     } else {
        //         mapTS.put(y, x);
        //     }
        // }
        // return true;
          String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map1.containsKey(c)) {
                if (!map1.get(c).equals(word)) return false;
            } else {
                map1.put(c, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != c) return false;
            } else {
                map2.put(word, c);
            }
        }

        return true;
    }
}
}