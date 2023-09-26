class Solution {
    public int minPartitions(String n) {
        int ans=0;
        char c='0';
        for(int i=0;i<n.length();i++){
            if(c<n.charAt(i)) c=n.charAt(i);
        }
        ans=(int)(c-'0');
        return ans;
    }
}