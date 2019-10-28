class Solution {
    public int reverse(int x) {
        int sign = x<0 ? -1 : 1;
        int num = x * sign;
        int reverse = 0;
        while(num > 0) {
            int prev_num = reverse;
            reverse = (reverse*10) + (num%10);
            if((reverse - (num%10)) / 10 != prev_num) {
                return 0;
            }            
            num = num/10;
        }
        return sign*reverse;
    }
}