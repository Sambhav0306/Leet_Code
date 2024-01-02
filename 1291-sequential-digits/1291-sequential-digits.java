class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        int k=1;
        while(k!=10){
            int m=k+1;
            int sum=k;
            while(m!=10 && sum<=high){
                sum=sum*10+m;
                m++;
                if(sum>=low && sum<=high) list.add(sum);
            }
            k++;
        }
        Collections.sort(list);
        return list;
    }
}