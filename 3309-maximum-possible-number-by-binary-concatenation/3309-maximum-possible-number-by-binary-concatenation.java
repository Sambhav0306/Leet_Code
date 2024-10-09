class Solution {
    public int maxGoodNumber(int[] nums) {
        String a=Integer.toBinaryString(nums[0]);
        String b=Integer.toBinaryString(nums[1]);
        String c=Integer.toBinaryString(nums[2]);
        int max=f(a,b,c);
        max=Math.max(max,f(a,c,b));
        max=Math.max(max,f(b,c,a));
        max=Math.max(max,f(b,a,c));
        max=Math.max(max,f(c,a,b));
        max=Math.max(max,f(c,b,a));
        return max;
    }
    public int f(String a,String b,String c){
        StringBuilder str=new StringBuilder(a);
        str.append(b);
        str.append(c);
        return Integer.parseInt(str.toString(), 2);
    } 
}