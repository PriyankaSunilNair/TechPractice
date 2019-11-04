public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List integers) {
        if (integers.size()<=1)
            return 0;
        int maxDiff;
        int i, j;
        int n =integers.size();
        int RMax[] = new int[n];
        int LMin[] = new int[n];
        LMin[0] = (int) integers.get(0);
        for (i = 1; i < n; ++i)
            LMin[i] = Math.min((int) integers.get(i), LMin[i - 1]);
        RMax[n - 1] = (int) integers.get(n - 1);
        for (j = n - 2; j >= 0; --j)
            RMax[j] = Math.max((int) integers.get(j), RMax[j + 1]);
    
        i=0;j=0;
        maxDiff=-1;
        while (i<n && j<n){
            if (LMin[i]<=RMax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }
            else
                i++;
        }
        return maxDiff;
    }
}
