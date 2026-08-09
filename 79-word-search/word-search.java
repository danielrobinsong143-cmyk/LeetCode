class Solution {
    int m, n;

    public boolean exist(char[][] board, String word) {

        // Write your code here
        m = board.length;
        n = board[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean dfs(char[][] board, String word, int row, int col, int index, boolean[][] vis) {
        if (index == word.length())
            return true;
        if (row < 0 || col < 0 || row >= m || col >= n || vis[row][col] || board[row][col] != word.charAt(index))
            return false;
        vis[row][col] = true;
        boolean found = dfs(board, word, row + 1, col, index+1, vis) || dfs(board, word, row - 1, col, index+1, vis)
                || dfs(board, word, row, col + 1, index+1, vis) || dfs(board, word, row, col - 1, index+1, vis);
        vis[row][col] = false;
        return found;
    }
}