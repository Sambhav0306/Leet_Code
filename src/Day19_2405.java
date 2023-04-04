import java.util.*;
public class Day19_2405 {
    public static void main(String[] args) {
        String s="ssssss";
        System.out.println(partitionString(s));
    }
    static int partitionString(String s) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.clear();
                map.put(s.charAt(i),1);
                count++;
            }
        }
        return count+1;
    }
}
