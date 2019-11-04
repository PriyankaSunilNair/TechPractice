public class Solution {
    public String convertToTitle(int A) {
        String title = "";
        boolean check = true;
        while(A > 0) {
            int rem = (A % 26);
            int charInt = rem + 'A' - 1;
            if (rem==0)
            {
                title = 'Z' + title;
                A = (A/26)-1;
                continue;
            }
            char c = (char)(charInt);
            title = c + title;
            A = A/26;
        }
        return title;
    }
}
