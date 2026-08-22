class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
                q.pollLast();
            }

            q.offerLast(r);

            if (q.peekFirst() < l) {
                q.removeFirst();
            }
            if ((r+1) >= k) {
                result[l] = nums[q.peekFirst()];
                l++;
            }
        }

    return result;
    }
}
