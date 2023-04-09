import java.util.*;
public class Day24 {
    public static void main(String[] args) {
        String[] tokens ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    static int evalRPN(String[] tokens) {
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
