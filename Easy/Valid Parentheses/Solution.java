package validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        if (s.length() < 2) return false;

        Map<Character,Character> brackets = new HashMap<Character,Character>(){{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};

        Stack<Character> characterStack = new Stack<>();
        for (Character currentBracket : s.toCharArray()) {
            if (brackets.containsKey(currentBracket)){
                characterStack.push(currentBracket);
                continue;
            }

            if (characterStack.empty() || currentBracket != brackets.get(characterStack.pop())) return false;
        }

        return characterStack.empty();
    }
}