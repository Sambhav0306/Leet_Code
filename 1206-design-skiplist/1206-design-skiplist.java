class Skiplist {
    HashMap<Integer,Integer> map;
    public Skiplist() {
        map=new HashMap<>();
    }
    
    public boolean search(int target) {
        return map.containsKey(target);
    }
    
    public void add(int num) {
        map.put(num,map.getOrDefault(num,0)+1);
    }
    
    public boolean erase(int num) {
        if(!map.containsKey(num)) return false;
        map.put(num,map.get(num)-1);
        if(map.get(num)==0) map.remove(num);
        return true;
    }
}
/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */