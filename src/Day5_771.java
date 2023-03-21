import java.util.HashMap;

public class Day5_771 {
    public static void main(String[] args){
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        HashMap <Character,Integer>  m=new HashMap <Character,Integer>();
        for(int  i=0;i<jewels.length();i++){
            m.put(jewels.charAt(i),1);
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(m.containsKey(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
