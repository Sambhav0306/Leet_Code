import java.util.*;
public class Day48_2657 {
    int[] findThePrefixCommonArray(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr=new int[a.length];
        int size=0;
        for(int i=0;i<a.length;i++){
            if(!set.isEmpty() && set.contains(a[i])){
                size++;
            }else{
                set.add(a[i]);
            }
            if(!set.isEmpty() && set.contains(b[i])){
                size++;
            }else{
                set.add(b[i]);
            }
            arr[i]=size;
        }
        return arr;
    }
}
