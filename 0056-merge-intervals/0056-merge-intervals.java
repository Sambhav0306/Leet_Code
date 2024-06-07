class Solution {
    public int[][] merge(int[][] mat) {
        Arrays.sort(mat,(x,y)->Integer.compare(x[0],y[0]));
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            List<Integer> list1=new ArrayList<>();
            list1.add(mat[i][0]);
            int max=mat[i][1];
            int j=i+1;
            while(j<mat.length){
                if(max>=mat[j][0]){
                    if(max>=mat[j][1]){
                        j++;
                    }else{
                        max=Math.max(max,mat[j][1]);
                        j++;
                    }
                }else{
                    break;
                }
            }
            list1.add(max);
            list.add(new ArrayList(list1));
            if(j!=i+1) i=j-1;
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0]=list.get(i).get(0);
            ans[i][1]=list.get(i).get(1);
        }
        return ans;
    }
}