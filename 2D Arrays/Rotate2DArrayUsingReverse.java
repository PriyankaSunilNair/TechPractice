public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
        }
        for(int i=0; i<n; i++) {
            int start = 0, end = n-1;
            while(start<end) {
                int temp = a.get(i).get(start);
                a.get(i).set(start, a.get(i).get(end));
                a.get(i).set(end, temp);
                start++;
                end--;
            }
        }
    }
}
