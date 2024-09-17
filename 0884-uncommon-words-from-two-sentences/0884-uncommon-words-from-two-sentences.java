class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       HashSet<String> set=new HashSet<>();
        HashSet<String> ans=new HashSet<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                if(set.contains(str.toString())){
                    if(ans.contains(str.toString())) ans.remove(str.toString());
                }else{
                    ans.add(str.toString());
                    set.add(str.toString());
                }
                str.delete(0,str.length());
            }else{
                str.append(s1.charAt(i));
            }
        }
        if(set.contains(str.toString())){
            if(ans.contains(str.toString())) ans.remove(str.toString());

        }
        else{
            ans.add(str.toString());
            set.add(str.toString());
        }
        str.delete(0,str.length());
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                if(set.contains(str.toString())){
                    if(ans.contains(str.toString())) ans.remove(str.toString());
                }else{
                    ans.add(str.toString());
                    set.add(str.toString());
                }
                str.delete(0,str.length());
            }
            else{
                str.append(s2.charAt(i));
            }
        }
        if(set.contains(str.toString())){
            if(ans.contains(str.toString())) ans.remove(str.toString());

        }
        else{
            ans.add(str.toString());
            set.add(str.toString());
        }
        int j=0;
        String[] string=new String[ans.size()];
        for(String s:ans){
            string[j]=s;
            j++;
        }
        return string;
    }
}