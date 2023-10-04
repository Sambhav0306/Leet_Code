class MyHashMap {
    ArrayList<Integer> list;
    ArrayList<Integer> list2;
    public MyHashMap() {
        list=new ArrayList<>();
        list2=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean flag=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                list2.set(i,value);
                flag=true;
            }
        }
        if(!flag){
            list.add(key);
            list2.add(value);
        }
    }
    
    public int get(int key) {
        // int val=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key) return list2.get(i);
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key) {
                list.remove(i);
                list2.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */