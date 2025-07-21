package validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    private Map<Character, Character> brackets = new HashMap<>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};


    public boolean isValid(String s) {
        if (s.length() < 2) return false;

        Stack<Character> stack = new Stack<>();
        for (Character currentBracket : s.toCharArray()) {
            if (brackets.containsKey(currentBracket)) {
                stack.push(currentBracket);
            } else {
                if (!brackets.get(stack.pop()).equals(currentBracket))
                    return false;
            }
        }
        return true;
    }
}
