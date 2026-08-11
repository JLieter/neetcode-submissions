class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap();        
        List<List<Integer>> freq = new ArrayList<>();
        int[] result = new int[k];

        for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }
        for (int num : nums) {
                freqMap.merge(num, 1, Integer::sum);
        }

        for (int n : freqMap.keySet()) {
            freq.get(freqMap.get(n)).add(n);
        }

        int index = 0;
        for (int i = freq.size()-1; i >= 0 && index < k; i--) {
            for (int num : freq.get(i)) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
