import java.util.*;
public class Day52_1456 {
    public static void main(String[] args) {
        String s="abciiidef";
        System.out.println(maxVowels(s,3));
    }
    static int maxVowels(String s, int k) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int max=0;
        int i=0;
        int j=0;
        int count=0;
        while(i<k){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        if(max<count){
            max=count;
        }
        i++;
        while(i!=s.length()){
            if(set.contains(s.charAt(j))){
                count--;
            }
            if(set.contains(s.charAt(i))){
                count++;
            }
            if(max<count){
                max=count;
            }
            i++;
            j++;
        }
        return max;
    }
}
