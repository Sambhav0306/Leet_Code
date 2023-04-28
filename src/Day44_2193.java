public class Day44_2193 {
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(minMovesToMakePalindrome(s));
    }
    static int minMovesToMakePalindrome(String s)
        {
            int strt = 0;
            int end = s.length()-1;
            int ans = 0;
            while(strt<end)
            {
                if(s.charAt(end) == s.charAt(strt))
                {
                    strt++;
                    end --;
                    continue;
                }
                int r__ = end;
                while(s.charAt(r__) != s.charAt(strt))
                    r__--;


                if(r__ == strt)
                {
                    ans += s.length()/2 - strt;
                    strt++;
                }
                else
                {
                    ans += end - r__;
                    while(end>r__)
                    {
                        s = swap(s,r__,r__+1);
                        r__++;
                        //ans++;
                    }
                    strt++;
                    end--;
                    //swap(s,r)
                }
                //strt++;

            }
            return ans ;
        }
        static String swap(String s , int i , int j)
        {
            StringBuilder sb = new StringBuilder(s);

            char temp = s.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
            return sb.toString();

        }
    }