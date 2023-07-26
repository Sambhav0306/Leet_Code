class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list1=new ArrayList<>();
        list1.add(0);
        f(graph,list1,0);
        return list;
        
    }
    public void f(int[][] graph, List<Integer> list1,int ind){
        if(ind==graph.length-1){
            list.add(new ArrayList<>(list1));
            return; 
        }
        for(int i=0;i<graph[ind].length;i++){
            list1.add(graph[ind][i]);
            f(graph,list1,graph[ind][i]);
            list1.remove(list1.size()-1);
        }
    }
}