class Solution {
    public String fractionAddition(String s) {
        HashSet<Integer> set=new HashSet<>();
        StringBuilder str=new StringBuilder();
        int cal=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='/') {
                if(i+2<s.length() && s.charAt(i+2)=='0') set.add(10);
                else set.add(s.charAt(i+1)-'0');
            }
        }
        int k=findLCM(set);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='/'){
                int a=s.charAt(i-1)-'0';
                int b=s.charAt(i+1)-'0';
                if(a==0) a=10;
                if(b==1 && i+2<s.length() && s.charAt(i+2)=='0') b=10;
                int c=k/b;
                if(a==10 && i-3>=0 && s.charAt(i-3)=='-') a=-a;
                a*=c;
                if(i-2>=0){
                    if(s.charAt(i-2)=='-') a=-a;
                }
                
                cal+=a;
            }
        }
        if(cal==0){
            str.append('0');
            str.append('/');
            str.append('1');
            return str.toString();
        }
        int n=gcd(Math.abs(cal-0),k);
        if(n>1){
            cal/=n;
            k/=n;
        }
        String t=cal+"";
        String t1=k+"";
        str.append(t);
        str.append('/');
        str.append(k);
        return str.toString();
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    
    static int findLCM(Set<Integer> set) {
        int lcmValue = 1;
        for (int num : set) {
            lcmValue = lcm(lcmValue, num);
        }
        return lcmValue;
    }
}