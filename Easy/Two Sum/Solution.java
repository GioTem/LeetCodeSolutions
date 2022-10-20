package two.sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int firstNum = nums[i];
            for(int k = i+1; k < nums.length; k++){
                int secondNum = nums[k];
                if(firstNum + secondNum == target){
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }

        return new int[2];
    }
}
