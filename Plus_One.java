class Solution {
  public int[] plusOne(int[] digits){
        int n=digits.length;
        int c=1;

        for (int i=n-1;i>=0;i--){
            int sum=digits[i]+c;
            if (sum<10){
                digits[i]=sum;
                c=0;
                break;
            } else{
                digits[i]=0;
                c=1;
            }
        }
        if (c==1){
            int[] result=new int[n+1];
            result[0]=1;
            for (int i=0;i<n;i++){
                result[i+1]=digits[i];
            }
            return result;
        }
        return digits;
    }
}