class Solution {
    public int maxSum(int[][] grid) {
        int max = -1, m = grid.length, n = grid[0].length;
        for (int row = 0; row < m - 2; row++) {
            for (int col = 0; col < n - 2; col++) {
                int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
                sum += grid[row + 1][col + 1];
                sum += grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}