class Solution {
   public static int maxSubArray(int[] A) {
        return divide(A,0,A.length-1);   
    }
    
   public static int divide(int[] A ,int start, int end){
       if(end-start ==0)
		   return A[start];
       if(end-start ==1)
		   return Math.max(Math.max(A[start],A[end]),A[start]+A[end]);
       int mid=(end+start)/2;
       int left=divide(A,start,mid);
       int right=divide(A,mid+1,end);
       int middlemax=A[mid];
       int temp=middlemax;
       for(int i=mid-1;i>=start;i--){
          temp+=A[i];
        if(middlemax<temp) middlemax=temp;
           
       }
        temp=middlemax;
        for(int i=mid+1;i<=end;i++){
           temp+=A[i];
            if(middlemax<temp) middlemax=temp;
           
       }   
       return Math.max(Math.max(left,right),middlemax);            
        
   } 
    
 
}