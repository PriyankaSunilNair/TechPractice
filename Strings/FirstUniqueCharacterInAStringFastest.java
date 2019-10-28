class Solution {
    public int firstUniqChar(String s) {
         if (0 == s.length()) return -1;
         int ans = Integer.MAX_VALUE;
         int first = -1;
         int last = -1;
         for (char c = 'a'; c <= 'z'; c++) {
             first = s.indexOf(c);
             last = s.lastIndexOf(c);
             if (first != - 1 && first == last) {
                 ans = Math.min(ans,first);
             }
         }
         return  (ans == Integer.MAX_VALUE) ? - 1 : ans;
    }
}