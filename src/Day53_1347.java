//public class Day53_1347 {
//    int minSteps(String s, String t) {
//        //  HashMap<Character,Integer> map=new HashMap<>();
//        //  int count=0;
//        //  for(int i=0;i<s.length();i++){
//        //      if(map.containsKey(s.charAt(i))){
//        //          map.put(s.charAt(i),map.get(s.charAt(i))+1);
//        //      }else{
//        //          map.put(s.charAt(i),1);
//        //      }
//        //  }
//        //  for(int i=0;i<t.length();i++){
//        //      if(map.containsKey(t.charAt(i))){
//        //          map.put(t.charAt(i),map.get(t.charAt(i))-1);
//        //          if(map.get(t.charAt(i))==0){
//        //              map.remove(t.charAt(i));
//        //          }
//        //      }else{
//        //          count++;
//        //      }
//        //  }
//        //  return count;
//        // Solution 2
//        // int count=0;
//        // int[] arr=new int[26];
//        // for(int i=0;i<s.length();i++){
//        //     arr[s.charAt(i)-'a']+=1;
//        // }
//        // for(int i=0;i<t.length();i++){
//        //     if(arr[t.charAt(i)-'a']==0){
//        //         count++;
//        //     }else{
//        //          arr[t.charAt(i)-'a']-=1;
//        //     }
//        // }
//        // return count;
//
//}
//}
