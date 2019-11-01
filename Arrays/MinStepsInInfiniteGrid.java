public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return 0;
        }
        int length = A.size();
        int count = 0;
        for(int i=0; i<length-1; i++) {
            int aDiff = Math.abs(A.get(i+1) - A.get(i));
            int bDiff = Math.abs(B.get(i+1) - B.get(i));
            count = count + Math.max(aDiff,bDiff);
        }
        return count;
    }
}
