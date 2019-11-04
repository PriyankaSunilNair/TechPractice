public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int n = A.size();
        if(n==0)
            return 0;
        int left[] = new int[n];
        left[0] = 0;
        for(int i=1;i<n;i++)
        {
            int j = i-1;
            while(j>0){
                if(A.get(i)<A.get(j)){
                    left[i] = j;
                    break;
                }
                j = left[j];
            }
        }
        int right[] = new int[n];
        for(int i=n-2;i>=0;i--)
        {
            int j = i+1;
            while(j>0)
            {
                if(A.get(i)<A.get(j))
                {
                    right[i] = j;
                    break;
                }
                j = right[j];
            }
        }
        long max = 0;
        for(int i=0;i<n;i++)
            max = Math.max((long)left[i]*right[i], max);
        return (int)(max%1000000007);
    } 
}