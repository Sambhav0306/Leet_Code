class Solution {
    public String reversePrefix(String word, char ch) {
        int count=0;
        int index=0;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                count++;
                index=i;
                break;
            }
        }
        if(count==0){
            return word;
        }else{
            StringBuilder s=new StringBuilder();
            for(int i=index;i>=0;i--){
                s.append(word.charAt(i));
            }    
            for(int i=index+1;i<word.length();i++){
                s.append(word.charAt(i));
            }
            String str=s.toString();
            return str;
        }
           
    }
}