class Solution {
    public int findCenter(int[][] edges) {
        int count1=0;
        int count2=0;
        int a=edges[0][0];
        int b=edges[0][1];
        for(int i=0;i<edges.length;i++){
            if(a==edges[i][0]) count1++;
            if(b==edges[i][1]) count2++;
            if(a==edges[i][1]) count1++;
            if(b==edges[i][0]) count2++;
        }
        if(count1==edges.length) return a;
        return b;
    }
}