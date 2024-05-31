class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[][] mat=new char[numRows][s.length()];
        for(int o=0;o<mat.length;o++){
            Arrays.fill(mat[o],' ');
        }
        int j=0;
        int i=0;
        int k=0;
        while(i<s.length()){
            if(j==0){
                while(j!=numRows && i<s.length()){
                    mat[j][k]=s.charAt(i);
                    i++;
                    j++;
                }
                k++;
                j--;
                j--;
            }else{
                mat[j][k]=s.charAt(i);
                i++;
                j--;
                k++;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i1=0;i1<numRows;i1++){
            for(int j1=0;j1<s.length();j1++){
                if(mat[i1][j1]!=' ') str.append(mat[i1][j1]);
            }
        }
        return str.toString();
    }
}