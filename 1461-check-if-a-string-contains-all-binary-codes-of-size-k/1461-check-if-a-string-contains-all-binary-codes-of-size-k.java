class Solution {
    public boolean hasAllCodes(String s, int k) {
        int size=(int)Math.pow(2,k);
        HashSet<String> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        int i=0;
        while(i<s.length() && i!=k){
            str.append(s.charAt(i));
            i++;
        }
        set.add(new String(str.toString()));
        while(i<s.length()){
            str.deleteCharAt(0);
            str.append(s.charAt(i));
            set.add(new String(str.toString()));
            i++;
        }
        if(set.size()==size) return true;
        return false;
    }
}