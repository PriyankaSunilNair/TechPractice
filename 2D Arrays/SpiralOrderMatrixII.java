public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int[][] a = new int[A][A];
        boolean left=false, right=true, up=false, down=false;
        int count = 1, i=0, j=0, round = 0;
        while(count <= (A*A)) {
            if(right) {
                a[i][j] = count++;
                j++;
                if(j == A-1-round) {
                    right = false;
                    down = true;
                }
            }
            else if(left) {
                a[i][j] = count++;
                j--;
                if(j == 0+round) {
                    left = false;
                    up = true;
                    round++;
                }
            }
            else if(down) {
                a[i][j] = count++;
                i++;
                if(i == A-1-round) {
                    down = false;
                    left = true;
                }
            }
            else {
                a[i][j] = count++;
                i--;
                if(i == 0+round) {
                    up = false;
                    right = true;
                }
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(i=0; i<A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(j=0; j<A; j++) {
                row.add(a[i][j]);
            }
            result.add(row);
        }
        return result;
    }
}