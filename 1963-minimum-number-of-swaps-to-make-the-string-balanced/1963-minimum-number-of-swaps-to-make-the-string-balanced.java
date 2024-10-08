class Solution {
    public int minSwaps(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='[') count++;
            else{
                if(count<=0){
                    ans++;
                }else{
                    count--;
                }
            }
        }
        return (ans+1)/2;
    }
}