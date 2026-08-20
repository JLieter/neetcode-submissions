class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for (char c : s1.toCharArray()) {
            s1Freq[c-'a']++;
        }

        char[] ca = s2.toCharArray();
        int l = 0;
        int r = 0;

        while (r < s2.length()) {
            if (r-l+1 <= s1.length()) {
                s2Freq[ca[r]-'a']++;
                r++;
            } else {
                if (Arrays.equals(s1Freq, s2Freq)) {
                    return true;
                } else {
                    s2Freq[ca[l]-'a']--;
                    l++;
                }
            }
        }
        if (Arrays.equals(s1Freq, s2Freq)) {
            return true;
        } else {
            return false;
        } 
    }
}
