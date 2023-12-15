class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder str=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),(knowledge.get(i).get(1)));
        }
        int j=0;
        while(j<s.length()){
            if(s.charAt(j)=='('){
                int k=j+1;
                StringBuilder st=new StringBuilder();
                while(s.charAt(k)!=')'){
                    st.append(s.charAt(k));
                    k++;
                }
                if(map.containsKey(st.toString())){
                    str.append(map.get(st.toString()));
                }else{
                    str.append('?');
                }
                j=k;
            }else{
                str.append(s.charAt(j));
            }
            j++;
        }
        return str.toString();
    }
}