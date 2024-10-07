class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='B' && stack.size()>0 && stack.peek()=='A'){
                stack.pop();
            }else if(c=='D' && stack.size()>0 && stack.peek()=='C'){
                stack.pop();
            }else{
                stack.push(c);
            }
            i++;
        }
        return stack.size();
    }
}