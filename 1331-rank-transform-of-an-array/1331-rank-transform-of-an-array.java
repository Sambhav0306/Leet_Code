class Solution {
    public int[] arrayRankTransform(int[] arr){
        int[] val=arr.clone();
        Arrays.sort(val);
        Map<Integer,Integer>mpp=new HashMap<Integer,Integer>();
        for(int a: val) mpp.putIfAbsent(a,mpp.size()+1);
        for(int i=0;i<arr.length;i++) arr[i]=mpp.get(arr[i]);
        return arr;
    }
}