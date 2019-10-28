import java.util.HashMap;

public class NR {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        if(s.length() == 0) {
            return null;
        }
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if(first==last) {
                return c;
            }
        }
        return null;
    }
}
