class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap();
        for (char c : t.toCharArray()) {
            freq.merge(c, 1, Integer::sum);

        }

        int l = 0;
        int match = 0;
        int minLen = s.length()+1;
        int i = -1;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (freq.containsKey(c) && freq.get(c) > 0) {
                match++;
            }

            freq.merge(c, -1, Integer::sum);

            if (match == t.length()) {
                char lc = s.charAt(l);

                while (freq.get(lc) < 0) {
                    freq.merge(lc, 1, Integer::sum);
                    l++;
                    lc = s.charAt(l);
                }

                int windowLen = r-l+1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    i = l;
                }

                freq.merge(lc, 1, Integer::sum);
                l++;
                match--;
            }
        }
        return i == -1 ? "" : s.substring(i, i+minLen); 
    }
}
