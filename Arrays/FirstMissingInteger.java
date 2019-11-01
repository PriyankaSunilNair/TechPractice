public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int last = 0;
        if(A.size() < 1) {
            return 1;
        }
        Collections.sort(A);
        for(int i=0; i<A.size(); i++) {
            int current = A.get(i);
            if(current > 0) {
                if(current != last+1) {
                    return last+1;
                }
                else{
                    last = current;
                }
            }
        }
        return last+1;
    }
}
