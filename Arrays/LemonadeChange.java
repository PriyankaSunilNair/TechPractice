class Solution {
    public boolean lemonadeChange(int[] bills) {
        int totalAvailable = 0;
        int five = 0, ten = 0, twenty = 0;
        for(int i=0; i<bills.length; i++) {
            if(bills[i] == 5) {
                totalAvailable += bills[i];
                five++;
            }
            else if(bills[i] == 10) {
                if(five < 1) {
                    return false;
                }
                else {
                    totalAvailable += 5;
                    five--;
                    ten++;
                }
            }
            else {
                if((ten<1 && five<3) || five<1) {
                    return false;
                }
                else {
                    totalAvailable += 5;
                    twenty++;                    
                    if(ten < 1) {
                        five -= 3;
                    }
                    else {
                        five--;
                        ten--;
                    }
                }                
            }
        }
        return true;
    }
}