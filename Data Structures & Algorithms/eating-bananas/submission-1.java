class Solution {     
    public int minEatingSpeed(int[] piles, int h) {         
        int l = 1;         
        int r = Arrays.stream(piles).max().getAsInt(); // Clean 1-liner to get max
        int result = r;          

        while (l <= r) {             
            int k = (l + r) / 2;             
            int hours = 0;             
            for (int p : piles) {                 
                hours += Math.ceil((double) p / k);             
            }             
            if (hours <= h) {                 
                result = Math.min(result, k);                 
                r = k - 1;             
            } else {                 
                l = k + 1;             
            }         
        }          
        return result;     
    } 
}