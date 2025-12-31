class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int n: nums){
           c=c^n;
        }
        return c;
    }
}