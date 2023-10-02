class FindSumPairs {
    int[] n1;
    int[] n2;
    HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.n1 = nums1;
        this.n2 =nums2;
        for(int i=0;i<nums2.length;i++)
        {
            hs.put(nums2[i],hs.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        hs.put(n2[index],hs.get(n2[index])-1);
        n2[index] = n2[index]+val;
        hs.put(n2[index],hs.getOrDefault(n2[index],0)+1);
    }
    
    public int count(int tot) {
        int count =0;
        for(int i=0;i<n1.length;i++)
        {
            if(hs.containsKey(tot-n1[i]))
            count = count+hs.get(tot-n1[i]);
            // for(int j=0;j<n1.length;j++)
            // {
            //     if(tot-n2[i]==n1[j])
            //     count++;
            // }
        }
        return count;
    }
}