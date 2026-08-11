class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> cols = new HashMap();
        HashMap<Integer, Set<Character>> rows = new HashMap();
        HashMap<String, Set<Character>> squares = new HashMap();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                //HashMap instantiation setup and making i,j key 
                String boxKey = (i/3) + "," + (j/3);
                rows.putIfAbsent(i, new HashSet<>());
                cols.putIfAbsent(j, new HashSet<>());
                squares.putIfAbsent(boxKey, new HashSet<>());

                if (board[i][j] == '.') {
                    continue;
                }
                else if (rows.get(i).contains(board[i][j]) ||
                    cols.get(j).contains(board[i][j]) ||
                    squares.get(boxKey).contains(board[i][j])) {
                    return false;
                } 
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squares.get(boxKey).add(board[i][j]);
            }
        }
        return true;
    }
}
