class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap();
        int l = 0;
        int result = 0;
        int maxFreq = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freqMap.merge(c, 1, Integer::sum);
            maxFreq = Math.max(maxFreq, freqMap.get(c));
            
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                freqMap.merge(leftChar, -1, Integer::sum);
                l++;
            }

            result = Math.max(result, r-l+1);
        }
        return result;
    }
}
