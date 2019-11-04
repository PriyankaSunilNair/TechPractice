public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<Integer>(A);
        Collections.sort(list);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int endIndex = Integer.MIN_VALUE;
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != list.get(i)) {
                if(result.size() < 1) {
                    result.add(i);
                }
                else {
                    endIndex = i;
                }
            }
        }
        if(endIndex > Integer.MIN_VALUE) {
            result.add(endIndex);
        }
        if(result == null || result.size()<1) {
            result.add(-1);
        }
        return result;
    }
}
