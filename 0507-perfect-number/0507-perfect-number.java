class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int count=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=2;i<num/2+1;i++){
            if(num%i==0 && !set.contains(i)){
                set.add(i);
                set.add(num/i);
                count+=i+num/i;
            }
        }
        return count==num;
    }
}