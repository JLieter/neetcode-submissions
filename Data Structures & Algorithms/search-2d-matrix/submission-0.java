class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix[0].length-1;
        int t = 0;
        int b = matrix.length-1;
        int row = -1;

        while (t <= b) {
            int m = (int) (t + b) / 2;
            if (target > matrix[m][r]) {
                t = m+1;
            } else if (target < matrix[m][0]) {
                b = m-1;
            } else {
                row = m;
                break;
            }
        }

        if (row == -1) {
            return false;
        }


        while (l <= r) {
            int m = (int) (l + r) / 2;
            if (matrix[row][m] < target) {
                l = m+1;
            } else if (matrix[row][m] > target) {
                r = m-1;
            } else {
                return true;
            }
        }
        return false;

    }
}
