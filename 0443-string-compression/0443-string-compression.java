class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> list=new ArrayList<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
                count++;
            }else{
                list.add(chars[i]);
                if(count==1){
                    count=0;
                    i=j;
                    continue;
                }else {
                    int k = 0;
                    while (count != 0) {
                        int rem = count % 10;
                        count = count / 10;
                        char c = (char) (rem + '0');
                        list.add(list.size() -  k, c);
                        k++;
                    }
                }
                i=j;
            }
        }
        list.add(chars[i]);
        if(count==1){
            count=0;
        }else {
            int k = 0;
            while (count != 0) {
                int rem = count % 10;
                count = count / 10;
                char c = (char) (rem + '0');
                list.add(list.size() - k, c);
                k++;
            }
        }
        
            for(int o=0;o<list.size();o++){
                chars[o]=list.get(o);
            }

        return list.size();
    }
}