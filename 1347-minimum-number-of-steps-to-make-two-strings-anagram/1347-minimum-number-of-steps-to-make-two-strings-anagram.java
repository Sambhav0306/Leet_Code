class Solution {
    public int minSteps(String s, String t) {
        int count=0;
    int[] arr=new int[26];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']+=1;
    }
    for(int i=0;i<t.length();i++){
        if(arr[t.charAt(i)-'a']==0){
            count++;
        }else{
             arr[t.charAt(i)-'a']-=1;
        }
    }
    return count;
    }
}