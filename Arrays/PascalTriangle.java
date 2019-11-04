public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<i+1; j++) {
                if(j==0 || j == i) {
                    row.add(1);
                }
                else {
                    int val = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    row.add(val);
                }
            }
            result.add(row);
        }
        return result;
    }
}
