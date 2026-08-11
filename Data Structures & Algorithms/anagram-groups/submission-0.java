class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> solution = new HashMap();
        for (String str : strs) {
            int[] charset = new int[26];
            for (int i = 0; i< str.length(); i++) {
                Character c = str.charAt(i);
                charset[((int) c - (int) 'a')] += 1;
            }
            String key = Arrays.toString(charset);
            if (solution.containsKey(key)) {
                solution.get(key).add(str);
            } else {
                solution.put(key, new ArrayList<>(List.of(str)));
            }
        }
        return solution.values().stream().toList();
    }
}
