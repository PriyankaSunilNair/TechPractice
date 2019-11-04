public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
        for(int i=0; i<=A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<i+1; j++) {
                if(j==0 || j==i) {
                    row.add(1);
                }
                else {
                    row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
            }
            if(i == A) {
                return row;
            }
            pascal.add(row);
        }
        return null;
    }
}
