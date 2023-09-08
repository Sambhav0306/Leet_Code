class Trie {
    HashSet<String> set;
    public Trie() {
        set=new HashSet<>();
    }
    
    public void insert(String word) {
        set.add(word);
    }
    
    public boolean search(String word) {
        return (set.contains(word));
    }
    
    public boolean startsWith(String prefix) {
        for(String s:set){
            if(s.indexOf(prefix)==0) return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */