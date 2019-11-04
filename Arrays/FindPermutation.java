public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = 1;
        int max = B;
        for(int i=0; i<A.length(); i++) {
            if(A.charAt(i) == 'D') {
              result.add(max--);  
            }
            else {
                result.add(min++);
            }
        }
        result.add(min);
        return result;
    }
}
