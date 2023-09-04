class MagicDictionary {
     HashSet<String> set;
    public MagicDictionary() {
        set=new HashSet<>();
    }
    
    public void buildDict(String[] nums) {
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
    }
    
    public boolean search(String s) {
        for(String i:set){
            if(s.length()!=i.length()){
                continue;
            }
            if(s.equals(i)) continue;
            int count=0;
            for(int j=0;j<i.length();j++){
                if(count>1) break;
                if(s.charAt(j)!=i.charAt(j)) count++;
            }
            if(count==1) return true;
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */