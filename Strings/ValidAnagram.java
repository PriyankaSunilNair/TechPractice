class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) {
                return false;
            }
            if(map.get(c) == 1) {
                map.remove(c);
            }
            else {
                map.put(c, map.get(c)-1);
            }
        }
        if(map.isEmpty()) {
            return true;
        }
        return false;
    }
}