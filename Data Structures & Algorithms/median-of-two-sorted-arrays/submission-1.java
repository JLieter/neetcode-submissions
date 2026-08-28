class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = nums1;
        int[] b = nums2;

        if (nums2.length < nums1.length) {
            a = nums2;
            b = nums1;
        }

        int total = a.length + b.length;
        int half = total / 2;

        int l = 0;
        int r = a.length;

        while (l <= r) {
            int i = (l + r) / 2; // A
            int j = half - i; // B

            int aLeft = (i > 0) ? a[i - 1] : Integer.MIN_VALUE;
            int aRight = (i < a.length) ? a[i] : Integer.MAX_VALUE;

            int bLeft = (j > 0) ? b[j - 1] : Integer.MIN_VALUE;
            int bRight = (j < b.length) ? b[j] : Integer.MAX_VALUE;

            // partition is correct
            if (aLeft <= bRight && bLeft <= aRight) {
                if (total % 2 != 0) {
                    return Math.min(aRight, bRight);
                } else {
                    return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
                }
            } else if (aLeft > bRight) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return 0.0;
    }
}
