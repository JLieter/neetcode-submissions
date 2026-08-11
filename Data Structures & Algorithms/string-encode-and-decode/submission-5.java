class Solution {

    public String encode(List<String> strs) {
        String encodedResult = "";
        for (String str : strs) {
            encodedResult += str.length() + "#" + str;
        }
        return encodedResult;
    }

    public List<String> decode(String str) {
        List<String> decodedResult = new ArrayList<>();
        int i=0;
        while(i < str.length()) { 
            int j = i;
            Character c = str.charAt(i);
            while (str.charAt(j) != '#') {
                j += 1;
            }
            Integer n = Integer.valueOf(str.substring(i,j));
            String strSegment = str.substring(j+1, j+n+1);
            decodedResult.add(strSegment);
            i = j+n+1;
            }
        return decodedResult;
    }
}
