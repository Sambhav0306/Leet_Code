class Solution {
    public int[] intersection(int[] arr, int[] nums) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        int i=0;
        Arrays.sort(nums);
        Arrays.sort(arr);
        while (i<arr.length) {
            if (i != arr.length-1 && arr[i] == arr[i + 1]) {
                i++;
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if (arr[i] == nums[j]) {
                        arrayList.add(arr[i]);
                        break;
                    }
                }
                i++;
            }
        }
            int [] ans= new int[arrayList.size()];
            for (int k=0;k<ans.length;k++) {
                ans[k] = arrayList.get(k);
            }

        return ans;
    }
}