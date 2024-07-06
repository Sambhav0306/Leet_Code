class Solution {
    public int passThePillow(int n, int time) {
        int balance = time % (n - 1);
        int rds = (int) time / (n - 1);
        return rds % 2 == 0 ? 1 + balance : n - balance;
    }
}
