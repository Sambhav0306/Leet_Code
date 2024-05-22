class Solution {
    List<List<String>> list1=new ArrayList<>(); 
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
        f(0,0,s,list);
        return list1;
    }
    public void f(int i,int j,String s,List<String> list){
        if(j==s.length()){
            if(i==s.length()){
                list1.add(new ArrayList<>(list));
            }
            return;
        }
        if(f1(i,j,s)){
            StringBuilder str=new StringBuilder();
            for(int k=i;k<=j;k++){
                str.append(s.charAt(k));
            }
            String s1=str.toString();
            list.add(s1);
            f(j+1,j+1,s,list);
            list.remove(list.size()-1);
        }
            f(i,j+1,s,list);
            return;
        
    }
    public boolean f1(int i,int j,String s){
        while(j>i){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}