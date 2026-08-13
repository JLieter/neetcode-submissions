class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length()-1;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            Character chari = s.charAt(i);
            Character charj = s.charAt(j);
            if (!Character.isLetterOrDigit(chari)) {
                continue;
            }
            while (!Character.isLetterOrDigit(charj) && j > i) {
                j--;
                charj = s.charAt(j);

            }
            if (j <= i) {
                return true;
            }
            if (chari != charj) {
                return false;
            }
            j--;
        }
        return true;
    }
}
