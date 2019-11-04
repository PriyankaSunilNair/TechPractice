public class Solution {
    public int solve(ArrayList<String> A) {
        ArrayList<Double> nums = new ArrayList<>();
        int l = A.size();
        if(l<3) {
            return 0;
        }
        for(int i=0; i<l; i++) {
            nums.add(Double.parseDouble(A.get(i)));
        }
        double a = nums.get(0);
        double b = nums.get(1);
        double c = nums.get(2);
        for(int i=3; i<l; i++) {
            double sum = a+b+c;
            if(sum > 1 && sum < 2) {
                return 1;
            }
            else if(sum > 2) {
                if(a > b && a > c) {
                    a = nums.get(i);
                }
                else if(b > a && b > c) {
                    b = nums.get(i);
                }
                else {
                    c = nums.get(i);
                }
            }
            else {
                if(a < b && a < c) {
                    a = nums.get(i);
                }
                else if(b < a && b < c) {
                    b = nums.get(i);
                }
                else {
                    c = nums.get(i);
                }
            }
        }
        if(a+b+c > 1 && a+b+c < 2) {
            return 1;
        }
        return 0;
    }
}
