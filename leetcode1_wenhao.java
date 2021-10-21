class Solution {
    public int[] twoSum(int[] nums, int target) {
        int output1 = 0;
        int output2 = 0;
        for(int i = 0; i < nums.length;i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    output1 = i;
                    output2 = j;
                    
                    
                }
            }
        }
        int[] output = {output1,output2};
        return output;
    }
}
