class Solution {
    public String entityParser(String text) {
        StringBuilder str=new StringBuilder(text);
        Map<String,Character> map=new HashMap<>();
        map.put("&quot;",'"');
        map.put("&apos;",'\'');
        map.put("&amp;",'&');
        map.put("&gt;",'>');
        map.put("&lt;",'<');
        map.put("&frasl;",'/');
        StringBuilder ans=new StringBuilder();
        int counter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='&'){
                int j=i+1;
                StringBuilder s=new StringBuilder("&");
                while(j<str.length() && j-i<=7){
                    s.append(str.charAt(j));
                    if(map.containsKey(s.toString())){
                        counter=1;
                        ans.append(map.get(s.toString()));
                        i=j;
                        break;
                    }
                    j++;
                }
            }
            if(counter==1){
                counter=0;
            }else{
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}