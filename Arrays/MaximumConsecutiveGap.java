public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        if(A.size() < 2) {
            return 0;
        }
        int maxGap = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>(A);
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++) {
            int diff = list.get(i+1) - list.get(i);
            if(maxGap < diff) {
                maxGap = diff;
            }
        }
        return maxGap;
    }
}
