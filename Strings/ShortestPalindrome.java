class Solution {
    public String shortestPalindrome(String s) {
        String result = "";
        int start=0, end=s.length()-1;
        for(int i=end; i>=0; i--) {
            if(s.charAt(start) == s.charAt(i)) {
                start++;
            }
            else {
                if(start!=i) {
                    i = start + i;
                    start = 0;
                }
            }
        }
        while(end >= start) {
            result += s.charAt(end--);
        }
        result += s;
        return result;
    }
}