class Solution {
    public int[] executeInstructions(int n, int[] arr, String s) {
        int[] nums=new int[s.length()];
        for(int i=0;i<s.length();i++){
            nums[i]=f(arr[0],arr[1],n,s,i);
        }
        return nums;
    }
    public int f(int i,int j, int n,String s,int k){
        if(i<0 || j<0 || i>=n || j>=n || k>=s.length()) return 0;
        int ans=0;
        if(i-1>=0 && s.charAt(k)=='U') ans+=1+f(i-1,j,n,s,k+1);
        if(i+1<n && s.charAt(k)=='D') ans+=1+f(i+1,j,n,s,k+1);
        if(j-1>=0 && s.charAt(k)=='L') ans+=1+f(i,j-1,n,s,k+1);
        if(j+1<n && s.charAt(k)=='R') ans+=1+f(i,j+1,n,s,k+1);
        return ans;
    }
}