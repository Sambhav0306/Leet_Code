public class Day35_1578 {
    public static void main(String[] args) {
        int[] arr={1,3,6,5,4,5,4,4,2,8,3,10,6,6};
        String s="aaaaaaaaaaaaaa";
        System.out.println(minCost(s,arr));
    }
    static int minCost(String s, int[] arr) {
        int sum=0;
        int i=0;
        int j=1;
        while(i<arr.length){
            if(j<arr.length && s.charAt(i)==s.charAt(j)){
                if(arr[i]<=arr[j]){
                    sum+=arr[i];
                    i=j;
                    j++;
                }else{
                    sum+=arr[j];
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
        return sum;
    }
}
