import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class test {

    public static void main(String[] args) {
      String s = "anagram";
String t = "nagaram";

HashMap<Integer, Character> map = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
    map.put(i, s.charAt(i));
}

for (int i = 0; i < t.length(); i++) {
    char ch = t.charAt(i);

    // find the key for this value
    Integer keyToRemove = null;
    for (Integer key : map.keySet()) {
        if (map.get(key) == ch) {
            keyToRemove = key;
            break;
        }
    }

    if (keyToRemove != null) {
        map.remove(keyToRemove);
    }
}

System.out.println(map);

        }
}