class Solution {
    public  int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            StringBuilder str=new StringBuilder();
            int k=i;
            boolean bool=true;
            while(k!=0){
                int rem=k%10;
                if(rem==2) str.append('5');
                else if(rem==5) str.append('2');
                else if(rem==6) str.append('9');
                else if(rem==9) str.append('6');
                else if(rem==0 || rem==1 || rem==8) str.append(rem);
                else {
                    bool=false;
                    break;
                }
                k/=10;
            }
            String s=str.reverse().toString();
            int n1=0;
            if(bool) {
                 n1=Integer.parseInt(s);
            }
            if(bool && n1!=i) {
//                 n1=Integer.parseInt(s);
                count++;
            }
        }
        return count;
    }
}