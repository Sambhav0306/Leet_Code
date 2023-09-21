class Solution {
    public int beautySum(String str) {
        char[]arr=str.toCharArray();
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            int[] freq = new int[26];

            for (int j = i; j < arr.length; j++)
            {
                freq[arr[j] - 'a']++;

                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) 
                  if(freq[k]!=0) 
                  {
                    maxFreq=Math.max(maxFreq,freq[k]);
                    minFreq=Math.min(minFreq,freq[k]);
                  }

                sum += maxFreq - minFreq;
            }
        }

        return sum;
    }
}