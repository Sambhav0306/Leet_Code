class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count=0;
        for(int i=0;i<points.length-1;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            int x2=points[i+1][0];
            int y2=points[i+1][1];
            int c1=0;
            int c2=0;
            if(x1<x2) c1=1;
            else c1=-1;
            if(y1<y2) c2=1;
            else c2=-1;
            while(x1!=x2 && y1!=y2){
                x1+=c1;
                y1+=c2;
                count++;
            }
            while(x1!=x2){
                x1+=c1;
                count++;
            }
            while(y1!=y2){
                y1+=c2;
                count++;
            }
        }
        return count;
    }
}