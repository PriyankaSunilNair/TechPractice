public class Solution {
    public ArrayList flip(String str) {
        ArrayList ans = new ArrayList<>();
        int max=0;
        int startMin=0;
        int endMin=0;
        int sum=0;  
        int start=0, end=0;
        for(int i=0;i<str.length();i++){
            end=i;
            if(str.charAt(i)=='0'){
                sum+=1;
            }
            else{
                sum-=1;
            }
            if(sum<0){
                sum=0;
                start=i+1;
            }
            if(max<sum){
                max=sum;
                startMin=start;
                endMin=end;
            }
        }
        if(max!=0){
            ans.add(startMin+1);
            ans.add(endMin+1);
        }
        return ans;
    }
}