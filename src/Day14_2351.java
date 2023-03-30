import java.util.*;
public class Day14_2351 {
    public static void main(String[] args) {
        String s="abccdfa";
        System.out.println(repeatedCharacter(s));
    }
    public static char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(set.contains(s.charAt(i))) return s.charAt(i);
            set.add(s.charAt(i));
        }
        return 'a';
    }
}
