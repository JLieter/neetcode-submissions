class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxArea = 0;
        while (l < r) {
            int height = 0;
            if (heights[l] > heights[r]) {
                height = heights[r];
            } else {
                height = heights[l];
            }
            int area = (r-l) * height;
            if (area > maxArea) {
                maxArea = area;
            }
            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxArea;  
    }
}
