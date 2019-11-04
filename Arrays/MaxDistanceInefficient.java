public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int max = 0;
        for(int i=0; i<A.size()-1; i++) {
            for(int j=i+1; j<A.size(); j++){
                if(A.get(i) <= A.get(j) && max<(j-i)) {
                    max = j-i;
                }
            }
        }
        return max;
    }
}
