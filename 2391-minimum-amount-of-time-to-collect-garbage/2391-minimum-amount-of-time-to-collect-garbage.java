class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        char[] arr={'P','G','M'};
        int in=0;
        int time=0;
        while(in!=3){
            int pre=0;
            for(int i=0;i<garbage.length;i++){
                String s=garbage[i];
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==arr[in]){
                        count++;
                    }
                }
                if(count==0){
//                    i++;
                    if(i<travel.length){
                        pre+=travel[i];
                    }
//                    i--;
                }else{
                    time+=count+pre;
                    pre=0;
                    if(i<travel.length){
                        pre+=travel[i];
                    }
                }
            }
            in++;
        }
        return time;
    }
}