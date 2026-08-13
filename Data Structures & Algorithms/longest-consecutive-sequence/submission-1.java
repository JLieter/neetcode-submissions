class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int num : nums) {
            arr.add(num);
        }

        int max = 0;
        for (int num : nums) {
            int newMax = 1;
            int i = num;
            if (arr.contains(i-1)) {
                continue;
            }
            while (arr.contains(i+1)) {
                newMax += 1;
                i++;
            }

            if (newMax > max) {
                max = newMax;
            }
        }
        return max;
    }
}
