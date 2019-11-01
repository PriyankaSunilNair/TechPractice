public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int rowCol = A + (A-1);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<rowCol; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<rowCol; j++) {
                int val = 1 + Math.max(Math.abs(i-(A-1)),Math.abs(j-(A-1)));
                row.add(val);
            }
            result.add(row);
        }
        return result;
    }
}
