class Solution {
    public String largestTimeFromDigits(int[] arr) {
        StringBuilder str=new StringBuilder();
        Arrays.sort(arr);
        if(arr[0]>2) return str.toString();
        for(int i=arr.length-1;i>=0;i--){
            int a=arr[i];
            if(arr[i]<=2){
                str.append((arr[i]));
                arr[i]=-1;
                for(int j=arr.length-1;j>=0;j--){
                    int b=arr[j];
                    boolean bool=false;
                    if(arr[j]!=-1){
                        if(str.charAt(0)=='2' && arr[j]<=3){
                            str.append((arr[j]));
                            arr[j]=-1;
                            bool=true;
                        }else if(str.charAt(0)=='1' || str.charAt(0)=='0') {
                            str.append((arr[j]));
                            arr[j] = -1;
                            bool = true;
                        }
                        if(bool)for(int k=arr.length-1;k>=0;k--){
                            str.append(':');
                            int c=arr[k];
                            if(arr[k]!=-1 && arr[k]<6){
                                str.append((arr[k]));
                                arr[k]=-1;
                                for(int l=arr.length-1;l>=0;l--){
                                    if(arr[l]!=-1) {
                                        str.append((arr[l]));
                                        return str.toString();
                                    }
                                }
                            }
                            if(str.length()==3) str.deleteCharAt(str.length()-1);
                            arr[k]=c;
                        }
                        if(str.length()==2) str.deleteCharAt(str.length()-1);
                        arr[j]=b;
                    }
                }
            }
            if(str.length()==1) str.deleteCharAt(str.length()-1);
            arr[i]=a;
        }
        return str.toString();
    }
}