class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr={a,b,c};
        Arrays.sort(arr);
        int max=0;
        max+=arr[2]-arr[1]-1;
        max+=arr[1]-arr[0]-1;
        int min=0;
        if(arr[1]-arr[0]==1 && arr[2]-arr[1]==1) min=0;
        else if(arr[1]-arr[0]==1 || arr[2]-arr[1]==1 || arr[2]-arr[1]==2 || arr[1]-arr[0]==2) min=1;
        else min=2;
        int[] nums={min,max};
        return nums;
    }
}