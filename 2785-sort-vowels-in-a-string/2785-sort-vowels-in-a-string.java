class Solution {
    public String sortVowels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                if(map.containsKey('A')){
                    str.append('A');
                    map.put('A',map.get('A')-1);
                    if(map.get('A')==0) map.remove('A');
                }
                else if(map.containsKey('E')){
                    str.append('E');
                    map.put('E',map.get('E')-1);
                    if(map.get('E')==0) map.remove('E');
                }
                else if(map.containsKey('I')){
                    str.append('I');
                    map.put('I',map.get('I')-1);
                    if(map.get('I')==0) map.remove('I');
                }
                else if(map.containsKey('O')){
                    str.append('O');
                    map.put('O',map.get('O')-1);
                    if(map.get('O')==0) map.remove('O');
                }
                else if(map.containsKey('U')){
                    str.append('U');
                    map.put('U',map.get('U')-1);
                    if(map.get('U')==0) map.remove('U');
                }
                else if(map.containsKey('a')){
                    str.append('a');
                    map.put('a',map.get('a')-1);
                    if(map.get('a')==0) map.remove('a');
                }
                else if(map.containsKey('e')){
                    str.append('e');
                    map.put('e',map.get('e')-1);
                    if(map.get('e')==0) map.remove('e');
                }
                else if(map.containsKey('i')){
                    str.append('i');
                    map.put('i',map.get('i')-1);
                    if(map.get('i')==0) map.remove('i');
                }
                else if(map.containsKey('o')){
                    str.append('o');
                    map.put('o',map.get('o')-1);
                    if(map.get('o')==0) map.remove('o');
                }
                else if(map.containsKey('u')){
                    str.append('u');
                    map.put('u',map.get('u')-1);
                    if(map.get('u')==0) map.remove('u');
                }
            }else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}