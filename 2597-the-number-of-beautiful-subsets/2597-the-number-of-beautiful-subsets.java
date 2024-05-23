class Solution {
    List<Integer> list=new ArrayList<>();
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return f(0,nums,k);
    }
    public int f(int i,int[] nums,int k){
        if(i==nums.length) return 0;
        boolean bool=true;
        for(int j=0;j<list.size();j++){
            if(Math.abs(list.get(j)-nums[i])==k) bool=false;
        }
        int take=0;
        if(bool){
            list.add(nums[i]);
            take=1+f(i+1,nums,k);
            list.remove(list.size()-1);
        }
        int not_take=f(i+1,nums,k);
        
        return take+not_take;
    }
}