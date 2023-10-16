class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<score.length;i++){
            list.add(score[i][k]);
            map.put(score[i][k],i);
        }
        Collections.sort(list);
        int[][] matrix=new int[score.length][score[0].length];
        int k1=list.size()-1;
        int j=0;
        while(k1>=0){
            int row=map.get(list.get(k1));
            for(int i=0;i<matrix[0].length;i++){
                matrix[j][i]=score[row][i];
            }
            k1--;
            j++;
        }
        return matrix;
    }
}