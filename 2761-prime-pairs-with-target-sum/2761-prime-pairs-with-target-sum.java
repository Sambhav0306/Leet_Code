class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
    boolean prime[] = new boolean[n + 1];  
    List<List<Integer>> list=new ArrayList<>();
    f(prime,n);
    prime[1]=false;
    prime[0]=false;
    for(int i=2;i<n;i++){
        if(prime[i]){
            int j=n-i;
            if(prime[j]){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                prime[i]=false;
                prime[j]=false;
            }
        }
    }
    return list;
   }
  public void f(boolean[] prime,int n)
    {
      
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                // set.add(p);
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
       // for(int i=2;i<prime.length;i++){
       //      // if(prime[i]) set.add(i);
       //  }
  }

}