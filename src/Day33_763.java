import java.util.*;
public class Day33_763 {
    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
    static List<Integer> partitionLabels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j>k){
                        k=j;
                    }
                }
            }
            if(i==k){
                list.add(k+1-sum);
                sum+=list.get(list.size()-1);
                k=i+1;
            }
        }
        list.add(k+1-sum);
        return list;
    }
}
