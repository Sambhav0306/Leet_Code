class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return play(0, 0, true, 0, nums.length - 1, nums);
    }
    
    private boolean play(int s1, int s2, boolean p1Turn, int start, int end, int[] nums) {
        if (start > end) return s1 >= s2;
        if (p1Turn) {   // Player 1's turn
            return play(s1 + nums[start], s2, false, start + 1, end, nums) ||
                   play(s1 + nums[end], s2, false, start, end - 1, nums);
        } else {        // Player 2's turn
            return play(s1, s2 + nums[start], true, start + 1, end, nums) &&
                   play(s1, s2 + nums[end], true, start, end - 1, nums);
        }
    }
}