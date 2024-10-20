class Solution {
    public List<String> stringSequence(String s) {
        StringBuilder str=new StringBuilder();
        List<String> list=new ArrayList<>();
        int i=0;
        while(!s.equals(str.toString())){
            char ch=s.charAt(i);
            char c='a';
            while(true){
                str.append(c);
                list.add(new String(str.toString()));
                if(ch!=c)str.deleteCharAt(i);
                else break;
                c=(char)(c+1);
            }
            i++;
        }
        return list;
    }
}