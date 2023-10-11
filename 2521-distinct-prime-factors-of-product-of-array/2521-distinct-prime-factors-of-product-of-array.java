class Solution {
    List<Integer> list=new ArrayList<>();
    public int distinctPrimeFactors(int[] nums) {
        steve(1000);
        int count=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            while(j<list.size() && list.get(j)<=nums[i]){
                if(nums[i]%list.get(j)==0){
                    list.remove(j);
                    count++;
                }else{
                    j++;
                }
            }
        }
        return count;
    }
    public  void steve(int n){
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime,true);
        for (int p = 2; p * p <= n; p++) { 
            if (prime[p] == true) { 
                for (int i = p * p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
        for(int i=2;i<n+1;i++){
            if(prime[i]==true) list.add(i);
        }
    }
}