class DataStream {
    int min=0;
    int count=0;
    int a=0;
    int val=0;
    public DataStream(int value, int k) {
        val=value;
        a=k;
    }
    
    public boolean consec(int num) {
        min++;
        if(num==val){
            if(count!=0) count--;
        }else{
            count=a;
        }
        if(min>=a && count==0) return true;
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */