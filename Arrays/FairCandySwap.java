class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0, req=0;
        Set<Integer> setB = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            sumA += A[i];
        }
        for(int j=0; j<B.length; j++) {
            sumB += B[j];
            setB.add(B[j]);
        }
        req = (sumB - sumA) / 2;
        for(int i=0; i<A.length; i++) {
            if(setB.contains(A[i] + req)) {
                return new int[]{A[i], A[i]+req};
            }
        }
        return null;
    }
}