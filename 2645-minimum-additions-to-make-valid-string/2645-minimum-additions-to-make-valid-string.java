class Solution {
    public  int addMinimum(String word) {
        if(word.length()==1){
            return 2;
        }
        StringBuilder str=new StringBuilder(word);
        int i=0;
        int count=0;
        while(i<str.length()){
            if(i%3==0 && str.charAt(i)!='a'){
                str.insert(i,'a');
                count++;
            }else if(i%3==1 && str.charAt(i)!='b'){
                str.insert(i,'b');
                count++;
            }else if(i%3==2 && str.charAt(i)!='c'){
                str.insert(i,'c');
                count++;
            }
            i++;
        }

        if(str.charAt(str.length()-1)=='a'){
            count++;
            count++;
        }
        if(str.charAt(str.length()-1)=='b'){
            count++;
        }
        return count;
    }
}
