class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                int su=b+a;
                String sum=Integer.toString(su);
                s.push(sum);
            }else  if(tokens[i].equals("-")){
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                int su=b-a;
                String sum=Integer.toString(su);
                s.push(sum);
            }else  if(tokens[i].equals("*")){
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                int su=b*a;
                String sum=Integer.toString(su);
                s.push(sum);
            }else  if(tokens[i].equals("/")){
                int a=Integer.parseInt(s.pop());
                int b=Integer.parseInt(s.pop());
                int su=b/a;
                String sum=Integer.toString(su);
                s.push(sum);
            }else{
                s.push(tokens[i]);
            }
        }
        int ans=Integer.parseInt(s.peek());
        return ans;
    }
}