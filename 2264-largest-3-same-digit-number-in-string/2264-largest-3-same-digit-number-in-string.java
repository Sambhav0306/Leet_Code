class Solution {
    public String largestGoodInteger(String s) {
        StringBuilder str=new StringBuilder();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                str.append(s.charAt(i));
                str.append(s.charAt(i));
                str.append(s.charAt(i));
                String a=str.toString();
                list.add(a);
                str.delete(0,str.length());
                // list.add(str.toString());
            }
        }
        if(list.size()==0) return "";
        String ans=list.get(0);
        for(int i=0;i<list.size();i++){
            if(ans.charAt(0)-'0'<list.get(i).charAt(0)-'0'){
                ans=list.get(i);
            }
        }
        return ans;
    }
}