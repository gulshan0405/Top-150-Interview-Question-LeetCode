import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubString {
    //brute force
    static public List<Integer> findSubstring(String s, String[] words) {
    int wordLen = words[0].length();
    int totalLen = wordLen * words.length;
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i + totalLen <= s.length(); i++) {
        HashMap<String, Integer> map = new HashMap<>();

        int count = 0;
        while (count < words.length) {
            int start = i + count * wordLen;
            int end = start + wordLen;

            String sub = s.substring(start, end);
            boolean found = false;

            for (String w : words) {
                if (sub.equals(w)) {
                    int freq = map.getOrDefault(w, 0);
                    if (freq == 0) {
                        map.put(w, 1);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) break;
            count++;
        }

        if (count == words.length) {
            result.add(i);
        }
    }
    return result;
}
//optimal solution
static public List<Integer> findSubstring2(String s, String[] words) {
    List<Integer> result = new ArrayList<>();
    if (s.length() == 0 || words.length == 0) return result;

    int wordLen = words[0].length();
    int wordCount = words.length;
    int totalLen = wordLen * wordCount;

    // frequency of required words
    HashMap<String, Integer> required = new HashMap<>();
    for (int i = 0; i < wordCount; i++) {
        required.put(words[i], required.getOrDefault(words[i], 0) + 1);
    }

    // try each possible offset
    for (int offset = 0; offset < wordLen; offset++) {
        HashMap<String, Integer> window = new HashMap<>();
        int left = offset;
        int count = 0;

        for (int right = offset; right + wordLen <= s.length(); right += wordLen) {
            String word = s.substring(right, right + wordLen);

            // word not needed
            if (!required.containsKey(word)) {
                window.clear();
                count = 0;
                left = right + wordLen;
                continue;
            }

            // add word to window
            window.put(word, window.getOrDefault(word, 0) + 1);
            count++;

            // too many occurrences → shrink from left
            while (window.get(word) > required.get(word)) {
                String leftWord = s.substring(left, left + wordLen);
                window.put(leftWord, window.get(leftWord) - 1);
                left += wordLen;
                count--;
            }

            // valid window found
            if (count == wordCount) {
                result.add(left);
            }
        }
    }

    return result;
}

}
