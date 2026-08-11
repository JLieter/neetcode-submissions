class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 0;
        while (j < (nums.length-1)){
            for (int i = j+1; i < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{j,i};
                }
            }
            j++;
        }
        return null;
    }
}
