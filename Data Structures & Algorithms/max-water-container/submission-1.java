class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxArea = 0;
        while (l < r) {
            int height = 0;
            int area = 0;
            if (heights[l] > heights[r]) {
                height = heights[r];
                area = (r-l) * height;
                r--;
            } else {
                height = heights[l];
                area = (r-l) * height;
                l++;
            }    
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;  
    }
}
