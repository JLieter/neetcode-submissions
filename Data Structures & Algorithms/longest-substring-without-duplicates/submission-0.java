class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> subset = new HashSet<>();
        // (j, i)
        int j = 0;
        int maxSize = 0;
        for (int i = 0; i < s.length(); i++) {
            while (subset.contains(s.charAt(i))) {
                subset.remove(s.charAt(j));
                j++;
            }
            subset.add(s.charAt(i));
            if (subset.size() > maxSize) {
                maxSize = subset.size();
            }
        }
        return maxSize;
    }
}
