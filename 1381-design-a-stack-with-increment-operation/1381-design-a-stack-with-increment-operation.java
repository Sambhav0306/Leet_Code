class CustomStack {
    int[] nums;
    int i=0;
    public CustomStack(int maxSize) {
        nums=new int[maxSize];
    }
    
    public void push(int x) {
        if(i>=nums.length) return;
        nums[i]=x;
        i++;
    }
    
    public int pop() {
        i--;
        if(i<0){
            i=0;
            return -1;
        }
        int ans=nums[i];
        nums[i]=0;
        return ans;
    }
    
    public void increment(int k, int val) {
        // int j=0;
        for(int j=0; j<i && j!=k ;j++){
            nums[j]=nums[j]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */