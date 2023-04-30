import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String s=")()())";
        System.out.println(longestValidParentheses(s));
    }
    static int longestValidParentheses(String s) {
        int max=0;
        int i=0;
        int count=0;
        Stack<Character> stack=new Stack<>();
        while(i<s.length()){
            if(stack.isEmpty() && s.charAt(i)==')'){
                if(count>max){
                    max=count;
                }
                count=0;
                i++;
            }else{
                if(s.charAt(i)=='('){
                    stack.push('(');
                    i++;
                }else{
                    while(!stack.isEmpty() && i<s.length() && s.charAt(i)==')'){
                        stack.pop();
                        count=count+2;
                        i++;
                    }
                }
            }
        }
        return max;
    }
}


