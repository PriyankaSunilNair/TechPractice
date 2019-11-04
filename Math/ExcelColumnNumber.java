public class Solution {
    public int titleToNumber(String A) {
        int column = 0;
        for(int i=0; i<A.length(); i++) {
            int charCode = A.charAt(i) - 'A' + 1;
            if(i > 0) {
                column *= 26;
            }
            column += charCode;
        }
        return column;
    }
}
