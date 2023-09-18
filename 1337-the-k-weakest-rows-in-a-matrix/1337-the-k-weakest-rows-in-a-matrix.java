class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    sum++;
                }
            }
            list.add(sum);
        }
        Set<Integer> set=new HashSet<>();
        int[] nums=new int[k];
        int ind=0;
        while(k!=0){
            int min=1000;
            int mini=0;
            for(int i=0;i<list.size();i++){
               if(set.contains(i)) continue;
                if(min>list.get(i)){
                    mini=i;
                    min=list.get(i);
                }
            }
            nums[ind]=mini;
            ind++;
            set.add(mini);
            k--;
        }
        return nums;
    }
}