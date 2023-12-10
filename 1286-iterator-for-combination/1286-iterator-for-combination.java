class CombinationIterator {
    List<String> list;
    int o=0;
    public CombinationIterator(String characters, int combinationLength) {
        list=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        f(0,characters,str,combinationLength);
    }
    public void f(int i,String s,StringBuilder str,int k){
        if(str.length()==k){
            String t=new String(str.toString());
            list.add(t);
            return;
        }
        for(int j=i;j<s.length();j++){
            str.append(s.charAt(j));
            f(j+1,s,str,k);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }
    public String next() {
        String t=list.get(o);
        o++;
        return t;
    }
    
    public boolean hasNext() {
        if(o!=list.size()) return true;
        return false;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */