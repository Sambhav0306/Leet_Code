class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i=1;i<=target[target.length-1];i++){
            stack.push(i);
            list.add("Push");
            if(i==target[j]){
                j++;
            }else{
                list.add("Pop");
            }
        }
        return list;
    }
}