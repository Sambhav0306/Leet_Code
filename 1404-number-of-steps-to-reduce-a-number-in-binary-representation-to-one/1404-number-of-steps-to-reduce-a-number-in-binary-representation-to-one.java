class Solution {
    public int numSteps(String s) {
        int count=0;
        StringBuilder str=new StringBuilder(s);
        while(str.length()!=1){
            if(str.charAt(str.length()-1)=='0') str.deleteCharAt(str.length()-1);
            else{
                int i=str.length()-1;
                boolean bool=false;
                while(i>=0){
                    if(str.charAt(i)=='1') str.setCharAt(i,'0');
                    else{
                        str.setCharAt(i,'1');
                        bool=true;
                        break;
                    }
                    i--;
                }
                if(!bool){
                    str.insert(0,'1');
                }
            }
            count++;
        }
        return count;
    }
}