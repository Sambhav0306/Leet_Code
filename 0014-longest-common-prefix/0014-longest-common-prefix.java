class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            int count=0;
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length() && strs[0].charAt(i)==strs[j].charAt(i)){
                    count=0;
                }else{
                    count++;
                    break;
                }
            }
            if(count==1){
                break;
            }else{
                str.append(strs[0].charAt(i));
            }
        }
         String s= str.toString();
        return s;
    }
}