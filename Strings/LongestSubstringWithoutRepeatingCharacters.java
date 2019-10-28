class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int result = 0, j = 0, i = 0;
        while(i<length && j<length) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                result = Math.max(result, i - j);
            }
            else {
                set.remove(s.charAt(j++));
            }
        }
        return result;
    }
}