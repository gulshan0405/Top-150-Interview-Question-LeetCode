public class Longest_Common_PreFix {

    public static void main(String[] args) {
        String[] a = { "cir", "car" };
        System.out.println(longestCommonPrefix(a));

    }
 
    //Brute Force
    static public String longestCommonPrefix(String[] strs) {

        String prefix = "";
        int i;
        for (int j = 0; j < 200; j++) {
            if (strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }
            for (i = 1; i < strs.length; i++) {
                if (j < strs[i].length() && j < strs[i - 1].length()) {
                    if (strs[i].charAt(j) == strs[i - 1].charAt(j)) {
                        continue;
                    } else {
                        return prefix;
                    }
                } else {
                    return prefix;
                }
            }
            if (i == strs.length) {
                prefix += strs[0].charAt(j);
            }
        }
        return prefix;
    }
    static public String longestCommonPrefixOptimal(String[] strs){
          if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
