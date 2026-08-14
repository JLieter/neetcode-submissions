class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (i > 0 && val == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l < r) {
                int sum = val + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    List<Integer> set = List.of(val,nums[l],nums[r]);
                    result.add(set);
                    l++;
                    while (nums[l] == nums[l-1] && l<r) {
                        l++;
                    }
                }
            }
        }
        return result;
    }
}
