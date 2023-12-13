class Solution {
    public int[] vowelStrings(String[] nums, int[][] queries) {
        int[] arr=new int[nums.length];
        int[] res=new int[queries.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            String s=nums[i];
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            if((c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')&&(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u')){
                count++;
            }
            arr[i]=count;
        }
        for(int i=0;i<res.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l!=0){
                res[i]=arr[r]-arr[l-1];
            }else{
                res[i]=arr[r];
            }
        }
        return res;
    }
}