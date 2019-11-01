public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rowLength = a.size();
        int colLength = a.get(0).size();
        Boolean[] rowTracker = new Boolean[rowLength];
        Boolean[] colTracker = new Boolean[colLength];
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                if(a.get(i).get(j) == 0) {
                    rowTracker[i] = true;
                    colTracker[j] = true;
                }
            }
        }
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                if((rowTracker[i] != null && rowTracker[i]) || (colTracker[j] != null && colTracker[j])) {
                    a.get(i).set(j,0);
                }
            }
        }
    }
}
