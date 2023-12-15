class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set1=new HashSet<>();
        HashSet<String> set2=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            set1.add(paths.get(i).get(1));
            set2.add(paths.get(i).get(0));
        }
        for(String s:set1){
            if(!set2.contains(s)) return s;
        }
        return " ";
    }
}