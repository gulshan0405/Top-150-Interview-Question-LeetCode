public class validPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder pal = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)) {
                pal.append(ch);
            }
        }

        int pt1 = 0;
        int pt2 = pal.length() - 1;

        while(pt1 < pt2) {
            if(pal.charAt(pt1) != pal.charAt(pt2)) {
                return false;
            }
            pt1++;
            pt2--;
        }

        return true;
    }
}
