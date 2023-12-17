class Solution {

    Integer[] memo;
    int[] nums;
    int target, length;

    public int maximumJumps(int[] nums, int target) {
        this.length = nums.length;
        this.nums = nums;
        this.target = target;

        memo = new Integer[length];
        memo[length - 1] = 0;

        return dfs(0);
    }

    private int dfs(int idx) {
        if (memo[idx] != null) {
            return memo[idx];
        }

        int result = -1, dis;

        for (int i = idx + 1; i < length; i++) {
            dis = nums[i] - nums[idx];

            if (-target <= dis && dis <= target) {
                result = Math.max(result, dfs(i));

                // break early if optimal result reached
                if (result >= length - 2 - i) {
                    break;
                }
            }
        }

        return memo[idx] = result == -1 ? -1 : result + 1;
    }
}