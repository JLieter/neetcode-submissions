class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            prefix[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }
        max = 0;
        for (int i = n-1; i >= 0; i--) {
            suffix[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(prefix[i], suffix[i]);
            if (min-height[i] > 0) {
                sum += min-height[i];
            }
        }
         return sum;
    }
}
