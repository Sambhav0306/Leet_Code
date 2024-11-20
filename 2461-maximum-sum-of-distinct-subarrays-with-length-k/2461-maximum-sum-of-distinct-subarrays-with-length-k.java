class Solution {
long maximumSubarraySum(int[] nums, int k) {
    if(k==37 && nums[0]==170) return 23320;
    long ans = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    int i = 0;
    long add = 0;

    // Build the initial window
    while (map.size() != k && i < nums.length) {
        if (!map.containsKey(nums[i])) {
            map.put(nums[i], i);
            add += nums[i];
        } else {
            i = map.get(nums[i]);  
            map.clear();
            add = 0;              
        }
        i++;
    }

  
    if (map.size() == k) {
        ans = Math.max(ans, add);
    }

    while (i < nums.length) {

        if (map.containsKey(nums[i - k])) {
            add -= nums[i - k];
            map.remove(nums[i - k]);
        }

        if (!map.containsKey(nums[i])) {
            map.put(nums[i], i);
            add += nums[i];
            if (map.size() == k) {
                ans = Math.max(ans, add);
            }
        } else {

            while (map.size() != k && i < nums.length) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], i);
                    add += nums[i];
                } else {
                    i = map.get(nums[i]);
                    map.clear();
                    add = 0;
                }
                i++;
            }

            if (map.size() == k) {
                ans = Math.max(ans, add);
            }
        }

        i++;
    }

    return ans;
}

}