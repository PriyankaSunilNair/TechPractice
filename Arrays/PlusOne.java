class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        for(int i=digits.length-1; i>=0; i--) {
            if(i == digits.length - 1) {
                result[i] = digits[i] + 1;
            }
            else {
                result[i] = digits[i];
                if(result[i+1] > 9) {
                    result[i]++;
                    result[i+1] = 0;
                }
            } 
        }
        if(result[0] > 9) {
            int[] result2 = new int[result.length+1];
            result2[0] = 1;
            result2[1] = 0;
            for(int i=1;i<result.length;i++) {
                result2[i+1] = result[i];
            }
            return result2;
        }
        return result;
    }
}