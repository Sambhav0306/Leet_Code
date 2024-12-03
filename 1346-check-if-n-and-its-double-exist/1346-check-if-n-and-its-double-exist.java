class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i: arr){
            set.add(i);
            if(i==0) count++;
        }
        for(int i:set){
            if(i!=0 && set.contains(i*2)) return true;
            if(i==0 && count>1) return true;
        }
        return false;
    }
}