public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        long length = A.size();
        boolean[] checked = new boolean[A.size()+1];
        long calcSum = (length * (length+1))/2;
        long sum = 0;
        int repeat = 0;
        for(int i=0; i<A.size(); i++) {
            checked[A.get(i)] = false;
        }
        for(int i=0; i<A.size(); i++) {
            int current = A.get(i);
            if(!checked[current]) {
                checked[current] = true;
                sum += current;
            }
            else {
                repeat = current;
                sum += current;
            }
        }
        result.add((int)repeat);
        result.add((int) (repeat + (calcSum - sum)));
        return result;
    }
}
