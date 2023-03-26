import java.util.*;
public class Day10_20 {
    public boolean isValid(String s) {
        if(s.length()%2==1 ){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() && (s.charAt(i)==')'|| s.charAt(i)=='}' || s.charAt(i)==']')){
                return false;
            }
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)==')'){
                    if(stack.peek()!='('){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else  if(s.charAt(i)=='}'){
                    if(stack.peek()!='{'){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else  if(s.charAt(i)==']'){
                    if(stack.peek()!='['){
                        return false;
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
