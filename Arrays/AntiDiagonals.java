public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> arr) 
    {
        int n=arr.size();
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(n==0)
        return res;
        for(int i=0;i<=(2*(n-1));i++)
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                int diff = i-j;
                if(j>=n || diff >=n)
                    continue;
                temp.add(arr.get(j).get(diff));
            }
            res.add(temp);
        }
        
        return res;
    }
}