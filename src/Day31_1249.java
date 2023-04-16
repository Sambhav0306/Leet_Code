import java.util.*;
public class Day31_1249 {
    String minRemoveToMakeValid(String s) {
        HashSet<Integer> set=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else if(stack.isEmpty() && s.charAt(i)==')'){
                set.add(i);
            }else if(s.charAt(i)==')'){
                stack.pop();
            }
        }
        while(stack.size()!=0){
            set.add(stack.pop());
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
