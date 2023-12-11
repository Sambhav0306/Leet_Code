class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
      HashMap<Integer,Integer> mp=new HashMap<>();
      for(int i:arr)
      mp.put(i,mp.getOrDefault(i,0)+1);
      for(int key:mp.keySet())
      {
          int f=mp.get(key);
          float percent=(float)f/(float)n;
          if(percent>0.25)
          return key;
      }  
      return -1;
    }
}
