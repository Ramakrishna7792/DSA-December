class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int temp=x;
        while(x>0){
            int r=x%10;
            n=n*10+r;
            x/=10;
        }
        if(temp==n){
            return true;
        }
        return false;
    }
}