class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] mat=new int[8][8];
        for(int i=0;i<queens.length;i++){
            mat[queens[i][0]][queens[i][1]]=1;
        }
        // mat[king[0]][king[1]]=2;
        int count=0;
        int a=king[0];
        int b=king[1];
        List<List<Integer>> list=new ArrayList<>();
        int i=a;
        while(i>=0){
            if(mat[i][b]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(b);
                list.add(new ArrayList<>(list1));
                break;
            }
            i--;
        }
        i=a;
        while(i!=8){
            if(mat[i][b]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(b);
                list.add(new ArrayList<>(list1));
                break;
            }
            i++;
        }
        int j=b;
         while(j>=0){
            if(mat[a][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(a);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            j--;
        }
        j=b;
        while(j!=8){
            if(mat[a][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(a);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            j++;
        }
        i=a;
        j=b;
        while(i>=0 && j>=0){
            if(mat[i][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            i--;
            j--;
        }
        i=a;
        j=b;
        while(i!=8 && j!=8){
            if(mat[i][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            i++;
            j++;
        }
        i=a;
        j=b;
        while(i>=0 && j!=8){
            if(mat[i][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            i--;
            j++;
        }
        i=a;
        j=b;
        while(i!=8 && j>=0){
            if(mat[i][j]==1){
                ArrayList<Integer> list1=new ArrayList<>();
                list1.add(i);
                list1.add(j);
                list.add(new ArrayList<>(list1));
                break;
            }
            i++;
            j--;
        }
        return list;
    }
}