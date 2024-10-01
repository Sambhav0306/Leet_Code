class Solution {
    // Memoization array to store results for [i][j][h]
    int[][][] dp = new int[51][51][101];

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        return f(0, 0, grid, health);
    }

    public boolean f(int i, int j, List<List<Integer>> grid, int h) {
        // Base case: when reaching the bottom-right corner
        if (i == grid.size() - 1 && j == grid.get(i).size() - 1) {
            if (grid.get(i).get(j) == 1) { // Dangerous cell
                return h >= 2;  // Need at least 2 health to survive
            } else { // Safe cell
                return h > 0;  // Need positive health to survive
            }
        }

        // If out of bounds or health is depleted
        if (i < 0 || j < 0 || i >= grid.size() || j >= grid.get(i).size() || h <= 0) {
            return false;
        }

        // Memoization check
        if (dp[i][j][h] != 0) {
            return dp[i][j][h] == 1;
        }

        int k = grid.get(i).get(j);  // Current cell's value
        grid.get(i).set(j, 2);  // Mark the current cell as visited

        boolean up = false, down = false, left = false, right = false;

        // Explore all four directions
        if (i - 1 >= 0 && grid.get(i - 1).get(j) != 2) {  // Move up
            up = f(i - 1, j, grid, h - (k == 1 ? 1 : 0));
        }
        if (j - 1 >= 0 && grid.get(i).get(j - 1) != 2) {  // Move left
            left = f(i, j - 1, grid, h - (k == 1 ? 1 : 0));
        }
        if (i + 1 < grid.size() && grid.get(i + 1).get(j) != 2) {  // Move down
            down = f(i + 1, j, grid, h - (k == 1 ? 1 : 0));
        }
        if (j + 1 < grid.get(i).size() && grid.get(i).get(j + 1) != 2) {  // Move right
            right = f(i, j + 1, grid, h - (k == 1 ? 1 : 0));
        }

        // Backtrack: Reset the current cell to its original value
        grid.get(i).set(j, k);

        // Memoize the result
        boolean result = up || down || left || right;
        dp[i][j][h] = result ? 1 : 2;

        return result;
    }
}
