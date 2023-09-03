class Solution {
    public String replaceWords(List<String> nums, String s) {
        StringBuilder str=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        Set<String> set=new HashSet<>();
        for(int i=0;i<nums.size();i++){
            set.add(nums.get(i));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans.append(str.toString());
                str.delete(0,str.length());
                ans.append(' ');
                continue;
            }
            str.append(s.charAt(i));
            if(set.contains(str.toString())){
                while(i<s.length() && s.charAt(i)!=' '){
                    i++;
                }
                i--;
            }
        }
        ans.append(str.toString());
        return ans.toString();
    }
}