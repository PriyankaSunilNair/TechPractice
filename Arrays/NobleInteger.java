public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        long length = A.size();
        for(int i=0; i<(int)length; i++) {
            if(i==length-1 && A.get(i) == 0) {
                return 1;
            }
            else if(i<length-1 && A.get(i+1) > A.get(i) && A.get(i) == (length-i-1)) {
                return 1;
            }
        }
        return -1;
    }
}
