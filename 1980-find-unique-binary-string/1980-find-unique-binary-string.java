class Solution {
    StringBuilder s=new StringBuilder();
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        f(set,str);
        return s.toString();
    }
    public void f(HashSet<String> set,StringBuilder str){
        if(str.length()==set.size()){
            if(!set.contains(str.toString()) && s.length()==0){
                s.append(str);
            }
            return;
        }
        str.append('0');
        f(set,str);
        str.deleteCharAt(str.length()-1);
        str.append('1');
        f(set,str);
        str.deleteCharAt(str.length()-1);
    }
}