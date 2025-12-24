class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        
        int sum=0,l=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            sum=gain[i]+l;
            res=Math.max(res,sum);
            l=sum;
        }

        return res;
    }
}