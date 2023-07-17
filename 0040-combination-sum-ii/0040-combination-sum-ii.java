class Solution {
    List<List<Integer>> list=new ArrayList<>();
    HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> list1=new ArrayList<>();
        f(arr,target,0,list1);
        return list;
    }
    public void f(int[] arr,int target,int ind,ArrayList<Integer> list1){
       if(target==0){
            // if(!set.contains(list1)){
              list.add(new ArrayList<>(list1));
              // set.add(list.get(list.size()-1));
            // }
            return ;
            
        }
        if(ind==arr.length){
            return;
        }
        // if(arr[ind]>target){
        //     return;
        // }
        for(int i=ind;i<arr.length;i++){
            if(ind<i && arr[i-1]==arr[i]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            list1.add(arr[i]);
            f(arr,target-arr[i],i+1,list1);
            list1.remove(list1.size()-1);
        }
    }
    // if(ind-1>=0){
//         //     if(arr[ind-1]==arr[ind]{
//         //       f(arr,target,ind+1,list1);
//         //         return;
//         //     }
//         if(target==0){
//             if(!set.contains(list1)){
//               list.add(new ArrayList<>(list1));
//               set.add(list.get(list.size()-1));
//             }
//             return ;
            
//         }
//         if(ind==arr.length){
//             return;
//         }
//         if(arr[ind]>target){
//             return;
//         }
//         list1.add(arr[ind]);
//         f(arr,target-arr[ind],ind+1,list1);
//         list1.remove(list1.size()-1);
//         f(arr,target,ind+1,list1);
}