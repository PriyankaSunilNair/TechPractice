public class OA {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        isOneAway("abcde", "abcd");  // should return true
        isOneAway("abde", "abcde");  // should return true
        isOneAway("a", "a");  // should return true
        isOneAway("abcdef", "abqdef");  // should return true
        isOneAway("abcdef", "abccef");  // should return true
        isOneAway("abcdef", "abcde");  // should return true
        isOneAway("aaa", "abc");  // should return false
        isOneAway("abcde", "abc");  // should return false
        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        if((s1.length() - s2.length() > 1) || (s2.length() - s1.length() > 1)) {
            return false;
        }
        else if(s1.length() == s2.length()){
            return isOneAwaySameLength(s1, s2);
        }
        else if(s1.length() > s2.length()) {
            return isOneAwayDiffLengths(s1, s2);
        }
        else {
            return isOneAwayDiffLengths(s2, s1);
        }
    }
    public static Boolean isOneAwaySameLength(String s1, String s2) {
        int i=0, count = 0;
        while(i<s1.length()) {
            if(s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if(count > 1) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static Boolean isOneAwayDiffLengths(String s1, String s2) {
        int i=0, count = 0;
        while(i<s2.length()) {
            if(s1.charAt(i+count) != s2.charAt(i)) {
                count++;
                if(count>1) {
                    return false;
                }
            }
            else {
                i++;
            }
        }
        return true;
    }
}
