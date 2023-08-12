class Solution {
    // int count=0;
    public int numOfSubarrays(int[] arr) {
        int count=0;
        int odd=0;
        int even=0;
        // int[] nums=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // nums[i]=sum;
            if(sum%2==1){
                odd++;
                count++;
            }else{
                even++;
            }
        }
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==1){
                odd--;
                count=(count+even)%(int)(Math.pow(10,9)+7);
            }else{
                even--;
                count=(count+odd)%(int)(Math.pow(10,9)+7);;
            }
        }
        return count;
    }
//     public void f(int i,int[] arr,int sum){
//         if(sum%2==1){
//             count++;
//         }
//         if(i==arr.length){
//             return ;
//         }
//         f(i+1,arr,sum+arr[i]);goo
        
//             // return;
//     }
}