class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int j=0;
        while(j!=digits.length()){
            String s=map.get(digits.charAt(j));
            for(int i=0;i<s.length();i++){
                list.add(Character.toString(s.charAt(i)));
            }
            int l=list.size();
            if(digits.charAt(j)=='9' || digits.charAt(j)=='7'){
                for(int i=0;i<l-4;i++){
                    for(int k=l-4;k<l;k++){
                        list.add(list.get(i).concat(list.get(k)));
                    }
                }

            }else {
                for(int i=0;i<l-3;i++){
                    for(int k=l-3;k<l;k++){
                        list.add(list.get(i).concat(list.get(k)));
                    }
                }
            }
            if(j>=1){
                for(int i=0;i<l;i++){
                    list.remove(0);
                }
            }
            j++;
        }
        return list;
    }
}