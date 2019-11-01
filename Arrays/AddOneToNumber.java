public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> inter = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        for(int i=A.size()-1; i>=0; i--) {
            int sum = A.get(i) + carry;
            if(i == A.size() - 1) {
                sum++;
            }
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            }
            else {
                carry = 0;
            }
            inter.add(sum);
        }
        if(carry == 1) {
            inter.add(carry);
        }
        while(inter.get(inter.size()-1) == 0) {
            inter.remove(inter.size()-1);
        }
        for(int i = inter.size()-1; i>=0; i--) {
            result.add(inter.get(i));
        }
        return result;
    }
}
