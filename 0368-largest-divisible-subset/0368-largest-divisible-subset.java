class Solution {
    List<Integer> current = new ArrayList<>();
    List<Integer> best = new ArrayList<>();

    public List<Integer> largestDivisibleSubset(int[] nums) {
        // solve(nums, 0);
        // return best;

        Arrays.sort(nums);
        // max(over each answer ending/including nums[i])
        List<Integer>[] dp = new ArrayList[nums.length];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++) {
            List<Integer> maxSubset = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0 && maxSubset.size() < dp[j].size()) {
                    // nums[i] is divisible by nums[j] so update max subset
                    // if the subset ending with nums[j] is the biggest seen so far
                    maxSubset = dp[j];
                }
            }

            // the max subset is the largest subset ending with a number which divides
            // nums[i] + nums[i]
            dp[i].addAll(maxSubset);
            dp[i].add(nums[i]);
        }
        
        List<Integer> maxSubset = new ArrayList<>();
        for(int i = 0; i < dp.length; i++) {
            if(maxSubset.size() < dp[i].size()) {
                maxSubset = dp[i];
            }
        }

        return maxSubset;
    }

    void solve(int[] nums, int start) {
        List<Integer> c = current;
        List<Integer> b = best;
        if(current.size() > best.size()) {
            best = new ArrayList<>(current);
        }

        for(int i = start; i < nums.length; i++) {
            if (canAdd(current, nums[i])) {
                current.add(nums[i]);
                solve(nums, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    boolean canAdd(List<Integer> current, int n) {
        for(int i : current) {
            if(i % n != 0 && n % i != 0) {
                return false;
            }
        }

        return true;
    }
}