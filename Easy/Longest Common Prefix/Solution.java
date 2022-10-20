package longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        Character currentChar = null;

        int i = 0;
        while(true){
            if(strs.length == 1){
                prefix = new StringBuilder(strs[0]);
                break;
            }

            boolean check = true;
            for(String currentStr : strs)
            {
                if (currentStr.length() == i) {
                    check = false;
                    break;
                }

                if (currentStr.isEmpty()) {
                    check = false;
                    continue;
                }

                char temp = currentStr.charAt(i);
                if(currentChar == null){
                    currentChar = temp;
                    continue;
                }

                if(currentChar != temp){
                    check = false;
                    break;
                }
            }

            if(!check) break;

            prefix.append(currentChar);

            currentChar = null;

            i++;
        }
        return prefix.toString();
    }
}