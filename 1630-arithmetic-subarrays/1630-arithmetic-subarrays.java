class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            boolean check=true;
            int[] arr=new int[r[i]-l[i]+1];
            int c=0;
            for(int j=l[i];j<=r[i];j++){
                arr[c]=nums[j];
                c++;
            }
            Arrays.sort(arr);
            int diff=arr[1]-arr[0];
            for(int j=2;j<arr.length;j++){
                if(arr[j]-arr[j-1]!=diff){
                    check=false;
                    break;
                }
            }
            list.add(check);
        }
        return list;
    }
}