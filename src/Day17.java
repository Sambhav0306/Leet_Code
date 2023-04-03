import java.util.*
public class Day17 {
    static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int index=0;
            int start=0;
            int count=0;
            int end=potions.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid-1>=0 && potions[mid]*spells[i]>=success && potions[mid-1]*spells[i]<success){
                    index=mid;
                    count++;
                    break;
                }else{
                    if(potions[mid]*spells[i]>=success){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            if(count==1){
                if(index==0){
                    spells[i]=potions.length;
                }else{
                    spells[i]=potions.length-index;
                }
            }else{
                spells[i]=0;
            }
        }
        return spells;
    }
}
