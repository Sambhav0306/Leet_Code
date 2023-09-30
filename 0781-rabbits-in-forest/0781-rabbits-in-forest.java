class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<answers.length;i++){
            if(!map.containsKey(answers[i]+1)){
                map.put(answers[i]+1,1);
            }else{
                map.put(answers[i]+1,map.get(answers[i]+1)+1);
            }
        }
        int sum=0;
        for(int i:map.keySet()){
            int ch=i;
            int a=map.get(ch);
            if(a%ch==0){
                sum+=ch*(a/ch);
            }else{
                sum+=ch*(a/ch+1);
            }
        }
        return sum;
    }
}