class Solution {
    public int maxDistance(List<List<Integer>> list) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int check1=-1;
        int check2=-1;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                if(min>list.get(i).get(j)){
                    min=list.get(i).get(j);
                    check1=i;
                }
                if(max<list.get(i).get(j)){
                    max=list.get(i).get(j);
                    check2=i;
                }
            }
        }
        if(check1!=check2) return Math.abs(max-min);
        else{
            int ans=0;
             min=Integer.MAX_VALUE;
             max=Integer.MIN_VALUE;
            for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                if(i!=check1 && min>list.get(i).get(j)){
                    min=list.get(i).get(j);
                }
                if(max<list.get(i).get(j)){
                    max=list.get(i).get(j);
                }
            }
            }
            ans=Math.abs(max-min);
            min=Integer.MAX_VALUE;
             max=Integer.MIN_VALUE;
            for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                if(min>list.get(i).get(j)){
                    min=list.get(i).get(j);
                }
                if(i!=check1 && max<list.get(i).get(j)){
                    max=list.get(i).get(j);
                }
            }
            }
            return Math.max(ans,Math.abs(max-min));
        }
    }
}