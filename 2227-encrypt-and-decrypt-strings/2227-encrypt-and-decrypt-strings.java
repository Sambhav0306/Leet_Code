class Encrypter {
    HashMap<Character,String> map;
    HashMap<String,Integer> map1 ;
    public Encrypter(char[] keys, String[] values, String[] nums) {
        map=new HashMap<>();
        map1=new HashMap<>();
        for(int i=0;i<keys.length;i++){
            map.put(keys[i],values[i]);
        }
        for(int i=0;i<nums.length;i++){
            StringBuilder str=new StringBuilder();
            boolean bool=false;
            for(int j=0;j<nums[i].length();j++){
                if(!map.containsKey(nums[i].charAt(j))){
                    bool=true;
                    break;
                }
                str.append(map.get(nums[i].charAt(j)));
            }
        if(!bool){
            if(!map1.containsKey(str.toString())){
            map1.put(str.toString(),1);
        }else{
            map1.put(str.toString(),map1.get(str.toString())+1);
        }
        }
        }
    }
    
    public String encrypt(String word1) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word1.length();i++){
            str.append(map.get(word1.charAt(i)));
        }
        return str.toString();
    }
    
    public int decrypt(String word2) {
     if(map1.containsKey(word2)){
         return map1.get(word2);
     }
        return 0;
    }
}

/**
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter obj = new Encrypter(keys, values, dictionary);
 * String param_1 = obj.encrypt(word1);
 * int param_2 = obj.decrypt(word2);
 */