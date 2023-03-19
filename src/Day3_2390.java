import java.util.*;
public class Day3_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            char a = stack.pop();
            str.append(a);
        }
        str.reverse();
        String string = str.toString();
        return string;
    }
}