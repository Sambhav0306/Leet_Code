public class Day55_165 {
    public static void main(String[] args) {
        String s1="7.5.2";
        String s2="7.5.3.4";
        System.out.println(compareVersion(s1,s2));
    }
    static int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;

        while(i < version1.length() || j < version2.length()){
            int num1 = 0;
            int num2 = 0;

            while(i<version1.length() && version1.charAt(i) != '.'){
                num1 = num1*10 + (version1.charAt(i)-'0');
                i++;
            }

            while(j<version2.length() && version2.charAt(j) != '.'){
                num2 = num2*10 + (version2.charAt(j)-'0');
                j++;
            }

            i++;
            j++;

            if(num1<num2) {
                return -1;
            }
            if(num1>num2){
                return 1;
            }
        }
        return 0;

    }
}