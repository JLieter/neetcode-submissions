class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length()-1;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            Character chari = s.charAt(i);
            System.out.println("Character I: " + chari);
            Character charj = s.charAt(j);
            System.out.println("Character J: " + charj);
            if (!Character.isLetterOrDigit(chari)) {
                continue;
            }
            while (!Character.isLetterOrDigit(charj) && j > i) {
                j--;
                charj = s.charAt(j);
                System.out.println("Character J: " + charj);

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
