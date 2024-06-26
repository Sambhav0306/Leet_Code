class Solution {
    public boolean wordPattern(String pattern, String s) {
      if(pattern == null || pattern.isEmpty())  {
        if(s == null || s.isEmpty()) {
          return true;
        }
        return false;
      }

      final String[] words = s.split(" ");
      if(pattern.length() != words.length) {
        return false;
      }

      final Map<Character, String> map = new HashMap<>();
      for(int i=0; i<words.length; i++) {
        final Character key = pattern.charAt(i);
        final String storedWord = map.get(key);
        final String word = words[i];
        if(storedWord != null) {
          if(!word.equals(storedWord)) {
            return false;
          }
        } else {
          map.put(key,word);
        }
      }

      final Set<String> uniqueValues = new HashSet<>(map.values());
      if(uniqueValues.size() != map.size()) {
        return false;
      }

      return true;
    }
}