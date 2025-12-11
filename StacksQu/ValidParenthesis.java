package StacksQu;

import java.util.Stack;

public class ValidParenthesis {
     public boolean isValid(String s) {
 Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                // if closing bracket but stack is empty, invalid
                if (st.isEmpty()) return false;

                char top = st.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // if anything left in stack, invalid
        return st.isEmpty();
    }
}
